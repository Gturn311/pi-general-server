package com.pi.admin.model;

import java.io.Serializable;

public class SsoaDataParams implements Serializable {

    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = 2261889245537884137L;
    private String uid;
    private String token;
    private Object reqData;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getReqData() {
        return reqData;
    }

    public SsoaDataParams setReqData(Object reqData) {
        this.reqData = reqData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SsoaDataParams [uid=");
        builder.append(uid);
        builder.append(", token=");
        builder.append(token);
        builder.append(", reqData=");
        builder.append(reqData);
        builder.append("]");
        return builder.toString();
    }

}
