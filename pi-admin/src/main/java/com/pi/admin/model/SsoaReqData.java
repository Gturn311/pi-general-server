package com.pi.admin.model;

import java.io.Serializable;
import java.util.List;

public class SsoaReqData<T> implements Serializable {

    /**
     * serialVersionUID:(用一句话描述这个变量表示什么).
     */
    private static final long serialVersionUID = 5753361995755167674L;

    private List<T> detailInfo;


    public List<T> getDetailInfo() {
        return detailInfo;
    }


    public void setDetailInfo(List<T> detailInfo) {
        this.detailInfo = detailInfo;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SsoaReqData [detailInfo=");
        builder.append(detailInfo);
        builder.append("]");
        return builder.toString();
    }

}
