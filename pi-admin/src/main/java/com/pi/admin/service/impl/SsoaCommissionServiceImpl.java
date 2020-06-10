package com.pi.admin.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.pi.admin.SsoaRequestHandler;
import com.pi.admin.model.SsoaReqData;
import com.pi.admin.service.DateUtils;
import com.pi.admin.service.SsoaCommissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.bubugao.framework.util.UtilJson;
import com.yunhou.gateway.ssoa.enums.UsedTicketType;

import com.yunhou.gateway.ssoa.model.UsedTicketInfo;


@Service
public class SsoaCommissionServiceImpl implements SsoaCommissionService {

    private final static Logger logger = LoggerFactory.getLogger(SsoaCommissionServiceImpl.class);

    @Autowired
    private SsoaRequestHandler ssoaRequestHandler;

    @Override
    public void syncUsedTicketInfo(String json) {

        String method = "/mix/getUsedTicketInfo.action";
        String methodMsg = "付费会员券归集数据接口";
        //json 封装数据类型
        List<UsedTicketInfo> dataList = jsonToUsedTicketInfos(json);

        if (dataListIsEmpty(dataList, methodMsg)) {
            return;
        }
        SsoaReqData<UsedTicketInfo> reqData = new SsoaReqData<>();
        reqData.setDetailInfo(dataList);
        String transDate = dataList.get(0).getTransDate();
        int recordSize = dataList.size();
        ssoaRequestHandler.sendData(reqData, transDate, recordSize, method, methodMsg);
    }

    @Override
    public void syncCommissionInfo(List<CommissionInfo> dataList) {

        String method = "/mix/getCommissionInfo.action";
        String methodMsg = "待支付佣金归集数据接口";

        if (dataListIsEmpty(dataList, methodMsg)) {
            return;
        }
        SsoaReqData<CommissionInfo> reqData = new SsoaReqData<>();
        reqData.setDetailInfo(dataList);
        String transDate = dataList.get(0).getTransDate();
        int recordSize = dataList.size();
        ssoaRequestHandler.sendData(reqData, transDate, recordSize, method, methodMsg);
    }

    @Override
    public void syncCommissionPayInfo(List<CommissionPayInfo> dataList) {

        String method = "/mix/getCommissionPayInfo.action";
        String methodMsg = "佣金支付记录数据接口";

        if (dataListIsEmpty(dataList, methodMsg)) {
            return;
        }
        SsoaReqData<CommissionPayInfo> reqData = new SsoaReqData<>();
        reqData.setDetailInfo(dataList);
        String transDate = dataList.get(0).getTransDate();
        int recordSize = dataList.size();
        ssoaRequestHandler.sendData(reqData, transDate, recordSize, method, methodMsg);
    }

    /**
     * 检查同步数据是否为空
     *
     * @param list
     * @param methodMsg
     * @return boolean
     * @author rzy
     * @date: 2019年8月24日 下午1:00:34
     * @version 1.0
     */
    private boolean dataListIsEmpty(List list, String methodMsg) {
        if (list == null || list.isEmpty()) {
            logger.warn("{},同步数据为空", methodMsg);
            return true;
        }
        return false;
    }

    private List<UsedTicketInfo> jsonToUsedTicketInfos(String json) {
        List<UsedTicketInfo> usedTicketInfos = new ArrayList<>();
        JSONArray jsonArray = JSON.parseArray(json);
        Integer num  = 1;
        for (Object object : jsonArray) {
            Map<String, Object> infoMap = UtilJson.toMap(object);
            UsedTicketType[] values = UsedTicketType.values();
            for (UsedTicketType usedTicketType: values) {
                addUsedTicketInfo(num, infoMap, usedTicketInfos,usedTicketType.getCode(),jsonArray.size());
                num++;
            }
        }
        return usedTicketInfos;
    }

    private void addUsedTicketInfo(Integer num, Map<String, Object> infoMap, List<UsedTicketInfo> usedTicketInfos , String typeCode,Integer arrSize) {
        String transDate = DateUtils.dateToString(new Date(), "yyyyMMdd");
        UsedTicketInfo usedTicketInfo = new UsedTicketInfo();
        usedTicketInfo.setTrxNum(createtrxNum(num,transDate,arrSize));
        usedTicketInfo.setTransDate(transDate);
        usedTicketInfo.setStoreCode("110001");
        usedTicketInfo.setStoreName("步步高商业连锁股份有限公司");
        usedTicketInfo.setItemStoreCode((String) infoMap.get("ebs_code"));
        usedTicketInfo.setItemStoreName((String) infoMap.get("shop_name"));
        if (UsedTicketType.GOODS.getCode().equals(typeCode)){
            usedTicketInfo.setTicketTypeName(UsedTicketType.GOODS.getName());
            usedTicketInfo.setTicketType(UsedTicketType.GOODS.getCode());
            BigDecimal goods_coupon_amount = (BigDecimal) infoMap.get("goods_coupon_amount");
            BigDecimal divide = goods_coupon_amount.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
            usedTicketInfo.setAmount(divide);
            // usedTicketInfos.add(usedTicketInfo);
        }else if (UsedTicketType.FREESHIPPING.getCode().equals(typeCode)){
            usedTicketInfo.setTicketTypeName(UsedTicketType.FREESHIPPING.getName());
            usedTicketInfo.setTicketType(UsedTicketType.FREESHIPPING.getCode());
            BigDecimal free_shipping_coupon_amount = (BigDecimal) infoMap.get("free_shipping_coupon_amount");
            BigDecimal divide = free_shipping_coupon_amount.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
            usedTicketInfo.setAmount(divide);
        }
        if (usedTicketInfo.getAmount() == null || usedTicketInfo.getAmount().compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        usedTicketInfos.add(usedTicketInfo);
    }


    private String createtrxNum(Integer num, String dateStr, Integer arrSize) {
        String trxNumKey = "FXZ01";
        Integer number = 100000;
        if (lengthNum(arrSize) >= 5) {
            number = Integer.valueOf((int) Math.pow(10, lengthNum(arrSize) + 1));
        }
        String str = String.valueOf(number + num);
        String subStr = str.substring(1);
        return trxNumKey + dateStr + subStr;
    }

    private int lengthNum(int num) {
        int count = 0; //计数
        while (num >= 1) {
            num /= 10;
            count++;
        }
        return count;
    }
}
