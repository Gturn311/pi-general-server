package com.pi.admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.bubugao.framework.util.UtilJson;

import com.pi.admin.mapper.MemberCommissionMapper;
import com.pi.admin.service.SsoaCommissionService;
import com.yunhou.gateway.mobile.utils.DateUtils;
import com.yunhou.gateway.mobile.utils.HttpsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gturn
 * @Title: MemberSSOAService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2020/6/8 15:01
 */
@Service
public class MemberSSOAService {

    private final static Logger logger = LoggerFactory.getLogger(MemberSSOAService.class);

    @Autowired
    private SsoaCommissionService ssoaCommissionService;

    @Autowired
    private MemberCommissionMapper memberCommissionMapper;

    private String dtURL ="http://datacenter.bubugao.api/bbg_share/getUsedTicketInfo";


    public void pushCommissionFlow(String number1,String number2) throws InterruptedException {
        System.out.println("num1="+number1+"   num2="+number2);
        //logger.info("num1={},num2={}",number1,number2);
        final List<CommissionInfo> commissionFlowList = memberCommissionMapper.queryCommissionFlowYesterday(number1,number2);
        final List<CommissionInfo> commissionInfos = memberCommissionMapper.queryHomeCommissionFlowYesterday(number1,number2);
        ssoaSyncComissionInfo(commissionFlowList, ComissionBusiType.SHARE.getCodeName());
        ssoaSyncComissionInfo(commissionInfos, ComissionBusiType.HOME.getCodeName());
    }

    public void pushCommissionWithdrawalFlow(String number1,String number2) throws InterruptedException {
        //logger.info("num1={},num2={}",num1,num2);
        final List<CommissionPayInfo> commissionWithdrawalFlowList = memberCommissionMapper.queryCommissionWithdrawalFlowYesterday(number1,number2);
        final List<CommissionPayInfo> commissionPayInfos = memberCommissionMapper.queryHomeCommissionWithdrawalFlowYesterday(number1,number2);
        ssoaSyncCommissionPayInfo(commissionWithdrawalFlowList, ComissionBusiType.SHARE.getCodeName());
        ssoaSyncCommissionPayInfo(commissionPayInfos, ComissionBusiType.HOME.getCodeName());
    }


    public void pushCommissionUsedTicketInfo(Date date) throws InterruptedException {
        //String url = "http://datacenter.bubugao.api/bbg_share/getUsedTicketInfo";
        String successCode = "0";
        //final List<UsedTicketInfo> syncUsedTicketInfos = new ArrayList<UsedTicketInfo>();
        String json = null;
        HashMap<String, String> map = new HashMap<>();
        Date nextNDate = DateUtils.nextNDate(date, -1);
        String dateToString = DateUtils.dateToString(nextNDate, "yyyy-MM-dd");
        map.put("cdate", dateToString);
        Map<String, Object> params = new HashMap<>();
        params.put("params", JSON.toJSONString(map));
        for (int i = 0; i < 10; i++) {
            try {
                if (json == null) {
                    Map<String, Object> resultMap = httpsClient().post(dtURL, params);
                    json = JSON.toJSONString(resultMap);
                    if (successCode.equals(JSON.parseObject(json).get("code"))) {
                        Object data = JSON.parseObject(json).get("data");
                        if (data!=null){
                            ssoaCommissionService.syncUsedTicketInfo(JSON.toJSONString(data));
                        }
                        logger.info("分享赚SSOA对账 付费会员券归集，json={}", json);
                        break;
                    } else {
                        //logger.warn("请求DT付费会员券信息失败，json={}", json);
                        json = null;
                        continue;
                    }
                }
            } catch (Exception e) {
                //logger.warn("分享赚SSOA对账 付费会员券归集异常，重试次数={}，json={}", i, json, e);
                //Thread.sleep(2000L);
            }
        }
    }

    private void ssoaSyncComissionInfo(List<CommissionInfo> commissionFlowList, String busiType) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                ssoaCommissionService.syncCommissionInfo(commissionFlowList);
                //logger.info("{}SSOA对账，commissionFlowList={}", busiType, UtilJson.writeValueAsString(commissionFlowList));
                break;
            } catch (Exception e) {
                //logger.warn("{}SSOA对账异常，重试次数={}，commissionFlowList={}", busiType, i, UtilJson.writeValueAsString(commissionFlowList), e);
                //Thread.sleep(2000L);
            }
        }
    }


    private void ssoaSyncCommissionPayInfo(List<CommissionPayInfo> commissionWithdrawalFlowList, String busiType) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                ssoaCommissionService.syncCommissionPayInfo(commissionWithdrawalFlowList);
                logger.info("{}SSOA对账，commissionWithdrawalFlowList={}", busiType, UtilJson.writeValueAsString(commissionWithdrawalFlowList));
                break;
            } catch (Exception e) {
                logger.warn("{}SSOA对账异常，重试次数={}，commissionWithdrawalFlowList={}", busiType, i, UtilJson.writeValueAsString(commissionWithdrawalFlowList), e);
                //Thread.sleep(2000L);
            }
        }
    }
    private static HttpsClient httpsClient() {
        HttpsClient httpClient = new HttpsClient();
        httpClient.build();
        return httpClient;
    }
}
