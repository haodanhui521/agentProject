package com.agent.core.common.validator;

import com.agent.core.common.validator.anno.InStringArray;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <p>
 * User: Young Chen
 * Date: 2018-04-09
 * Time: 17:15
 */
public class InStringArrayValidator implements ConstraintValidator<InStringArray, String> {

    private String message;
    private String[] array;

    @Override
    public void initialize(InStringArray inStringArray) {
        this.array = inStringArray.array();
        this.message = inStringArray.message();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        // 不验证空
        if (StringUtils.isBlank(value)) {
            return true;
        }

        if (null != array && array.length != 0) {
            List<String> strings = Arrays.asList(array);
            boolean contains = strings.contains(value.trim());
            if (contains) {
                return true;
            }
        }

        if (StringUtils.isNotBlank(message)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        }
        return false;
    }
}
