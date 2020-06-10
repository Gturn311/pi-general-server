package com.pi.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.pi.admin.model.SsoaDataParams;
import com.pi.admin.model.SsoaReqData;
import com.yunhou.gateway.mobile.utils.HttpsClient;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
public class SsoaRequestHandler {

    private final static Logger logger = LoggerFactory.getLogger(SsoaRequestHandler.class);

    @Value("${bbg.ssoa.url:http://192.168.7.73:7001/OAWSSMS}")
    private String ssoaURL;

    public void sendData(SsoaReqData reqData, String transDate, int recordSize, String method, String methodMsg){
        SsoaDataParams paramObj = getUidAndToken(transDate, recordSize);
        paramObj.setReqData(reqData);
        ssoaDataSend(method, methodMsg, paramObj);
    }

    /**
     * 获取SSOA签名数据
     * @author rzy
     * @date: 2019年8月24日 下午1:01:18
     * @version 1.0
     * @param transDate
     * @param recordSize
     * @return
     * @return Map<String,String>
     */
    private SsoaDataParams getUidAndToken(String transDate, int recordSize) {
        //加密机制如下：
        //1.uid字段组成：前8位为数据的yyyyMMdd业务日期+ detailInfo内的数据条目数。
        //2.token字段为uid进行MD5加密后32位大写格式
        SsoaDataParams paramObj = new SsoaDataParams();
        StringBuffer uid = new StringBuffer().append(transDate).append(recordSize);
        String token = DigestUtils.md5Hex(uid.toString()).toUpperCase();
        paramObj.setUid(uid.toString());
        paramObj.setToken(token);
        return paramObj;
    }


    /**
     * SSOA数据发送公共方法
     *
     * @param method
     * @param methodMsg
     * @param paramsObj
     * @return void
     * @throws IOException
     * @author rzy
     * @date: 2019年8月23日 下午7:59:14
     * @version 1.0
     */
    private void ssoaDataSend(String method, String methodMsg, SsoaDataParams paramsObj) {
        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("data", JSON.toJSONString(paramsObj));
            String url = ssoaURL+method;
            Map<String, Object> resultMap = httpsClient().post(url, params);

            String status = resultMap.get("status") + "";
            String statusMsg = resultMap.get("statusMsg") + "";

            if ("0".equals(status)) {
                logger.info("{},SSOA同步上传成功,url={},paramsObj={},status={},statusMsg={}", methodMsg, url, JSON.toJSONString(paramsObj), status, statusMsg);
            } else {
                logger.error("{},SSOA同步上传失败,url={},paramsObj={},status={},statusMsg={}", methodMsg, url, JSON.toJSONString(paramsObj), status, statusMsg);
                throw new Exception();
            }
        } catch (Exception e) {
            logger.error("{},异常", methodMsg, e);
            //throw new BbgCenterException("99999", e.getMessage());
            System.out.println("上传错误");
        }
    }

    private static HttpsClient httpsClient() {
        HttpsClient httpClient = new HttpsClient();
        httpClient.build();
        return httpClient;
    }

}
