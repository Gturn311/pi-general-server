package com.pi.admin.service.impl;

public enum ComissionBusiType {
    SHARE("SHARE", "分享赚"),
    HOME("HOME", "小步到家");

    private String code;
    private String codeName;

    public String getCode() {
        return code;
    }

    public String getCodeName() {
        return codeName;
    }

    private ComissionBusiType(String code, String codeName) {
        this.code = code;
        this.codeName = codeName;
    }

    public ComissionBusiType to(String code) {
        for (ComissionBusiType enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return SHARE;
    }
}
