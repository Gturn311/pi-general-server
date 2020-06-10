package com.pi.admin.service.impl;

import com.pi.admin.service.impl.BaseCommissions;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommissionPayInfo extends BaseCommissions implements Serializable {

    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = -4973962540542450488L;

    private String bankName; // 付款银行名称
    private String bankAccount; // 付款银行账户
    private BigDecimal totalAmt; // 应支付金额（元）
    private BigDecimal payAmt; // 实际支付金额（元）
    private BigDecimal taxAmt; // 代扣个人所得税（元）
    private BigDecimal vatAmt; // 增值税及附加金额（元）
    private String busiType; // 佣金来源类型：SHARE——分享赚 HOME--小步到家

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(BigDecimal vatAmt) {
        this.vatAmt = vatAmt;
    }

    public String getBankName() {
        return bankName;
    }

    public CommissionPayInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public CommissionPayInfo setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public CommissionPayInfo setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
        return this;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public CommissionPayInfo setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayCommissionsRecord [bankName=");
        builder.append(bankName);
        builder.append(", bankAccount=");
        builder.append(bankAccount);
        builder.append(", totalAmt=");
        builder.append(totalAmt);
        builder.append(", payAmt=");
        builder.append(payAmt);
        builder.append(", taxAmt=");
        builder.append(taxAmt);
        builder.append(", vatAmt=");
        builder.append(vatAmt);
        builder.append("]");
        return builder.toString();
    }

}
