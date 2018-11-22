package com.agent.core.response;

import com.agent.core.common.enums.ErrorCodeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<R> implements Serializable{
    private String code;
    private String msg;
    private R data;

    public static <R> Result<R> ofSuccess(R data) {
        Result<R> result = new Result<>();
        result.setCode(ErrorCodeEnum.SYSTEM_SUCCESS.getErrorCode());
        result.setMsg(ErrorCodeEnum.SYSTEM_SUCCESS.getErrorMsg());
        result.setData(data);
        return result;
    }
    public static <R> Result<R> ofSuccess() {
        Result<R> result = new Result<>();
        result.setCode(ErrorCodeEnum.SYSTEM_SUCCESS.getErrorCode());
        result.setMsg(ErrorCodeEnum.SYSTEM_SUCCESS.getErrorMsg());
        return result;
    }


    public static <R> Result<R> ofSuccessMsg(String msg) {
        Result<R> result = new Result<>();
        result.setCode(ErrorCodeEnum.SYSTEM_SUCCESS.getErrorCode());
        result.setMsg(msg);
        return result;
    }

    public static <R> Result<R> ofFail(String code, String msg) {
        Result<R> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <R> Result<R> ofThrowable(String code, Throwable throwable) {
        Result<R> result = new Result<>();
        result.setCode(code);
        result.setMsg(throwable.getClass().getName() + ", " + throwable.getMessage());
        return result;
    }
}
