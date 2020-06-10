package com.pi.admin.service.impl;

import java.io.Serializable;

public class BaseCommissions implements Serializable {

    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = -5035236167030128637L;
    private String trxNum; // 业务单号 FXZ03+日期+序号
    private String transDate; // 业务日期 必须为yyyyMMdd格式
    private String storeCode; // 分享赚主门店编码
    private String storeName; // 分享赚主门店名称

    public String getTrxNum() {
        return trxNum;
    }

    public BaseCommissions setTrxNum(String trxNum) {
        this.trxNum = trxNum;
        return this;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseCommissions [trxNum=");
        builder.append(trxNum);
        builder.append(", transDate=");
        builder.append(transDate);
        builder.append(", storeCode=");
        builder.append(storeCode);
        builder.append(", storeName=");
        builder.append(storeName);
        builder.append("]");
        return builder.toString();
    }

}
