package com.agent.core.common.validator;

import com.agent.core.common.validator.anno.InIntArray;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Description:
 * <p>
 * User: Young Chen
 * Date: 2018-04-09
 * Time: 17:15
 */
public class InIntArrayValidator implements ConstraintValidator<InIntArray, Integer> {

    private String message;
    private int[] array;

    @Override
    public void initialize(InIntArray inIntArray) {
        this.array = inIntArray.array();
        this.message = inIntArray.message();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        // 不验证空
        if (value == null) {
            return true;
        }

        if (null != array && array.length != 0) {
            for(int i:array){
                if(i == value){
                   return true;
                }
            }
        }

        if (StringUtils.isNotBlank(message)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        }

        return false;
    }
}
