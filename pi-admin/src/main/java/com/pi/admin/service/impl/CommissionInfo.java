package com.pi.admin.service.impl;


import java.io.Serializable;
import java.math.BigDecimal;

public class CommissionInfo extends BaseCommissions implements Serializable {

    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = -1226100329854734279L;
    private String itemStoreCode; // 产生应支付佣金门店编码
    private String itemStoreName; // 产生应支付佣金门店名称
    private String busiType; // 佣金来源类型：GOODS——商品佣金 MEMBER——会员佣金
    private BigDecimal amount; // 金额（元）

    public String getItemStoreCode() {
        return itemStoreCode;
    }

    public void setItemStoreCode(String itemStoreCode) {
        this.itemStoreCode = itemStoreCode;
    }

    public String getItemStoreName() {
        return itemStoreName;
    }

    public void setItemStoreName(String itemStoreName) {
        this.itemStoreName = itemStoreName;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UnpaidCommission [itemStoreCode=");
        builder.append(itemStoreCode);
        builder.append(", itemStoreName=");
        builder.append(itemStoreName);
        builder.append(", busiType=");
        builder.append(busiType);
        builder.append(", amount=");
        builder.append(amount);
        builder.append("]");
        return builder.toString();
    }

}
