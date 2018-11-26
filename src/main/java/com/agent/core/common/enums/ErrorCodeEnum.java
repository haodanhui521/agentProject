package com.agent.core.common.enums;

/**
 * 业务异常状态码枚举
 */
public enum ErrorCodeEnum {

    // 公共状态 F10xx
    SYSTEM_SUCCESS("S0001","成功"),
    SYSTEM_EXCEPTION("F9999","系统异常!"),
    SYSTEM_BUSY_EXCEPTION("F8888","系统繁忙，请稍后再试..."),
    PARAM_FORMAT ("F2222", "参数校验错误: "),
    SIGN_ERROR("F1111", "签值错误"),

    // 商户相关 F11xx
    MERCHANT_NO_NOT_EXIST("F1101", "商户号错误"),
    MERCHANT_NAME_EXIST("F1102", "商户名称已存在"),
    MERCHANT_MOBILE_EXIST("F1103", "商户手机号码已存在"),
    MERCHANT_EMAIL_EXIST("F1104", "商户号邮箱已存在"),
    MERCHANT_LOGIN_NAME_EXIST("F1105", "商户号登录名称已存在"),

    // 订单相关 F12xx
    TRADE_INFO_ERROR("F1003", "订单信息不存在"),
    TRADE_STATUS_ERROR("F1202", "订单状态异常"),
    TRADE_NO_IS_EXITED("F1203", "订单号重复"),

    // 设备相关 F13xx
    MERCHANTISNOTEXITED("F1304", "商户不存在"),
    ;


    private String errorCode;

    private String errorMsg;

    ErrorCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
