package com.agent.core.common.validator.anno;


import com.agent.core.common.validator.PhoneValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message() default "不是合法的手机号";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}