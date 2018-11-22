package com.agent.core.exception;

import com.agent.core.common.enums.ErrorCodeEnum;
import lombok.Data;

/**
 * @Description: 业务异常
 * @Auther Young Chen
 * @Date: 2018-10-31
 */
@Data
public class BizException extends RuntimeException {

    private String code;
    private String msg;

    public BizException(ErrorCodeEnum code) {
        this.msg = code.getErrorMsg();
        this.code = code.getErrorCode();
    }

    public BizException(String code, String msg) {
        this.msg = msg;
        this.code = code;
    }
}
