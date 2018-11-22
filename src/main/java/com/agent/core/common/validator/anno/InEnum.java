package com.agent.core.common.validator.anno;


import com.agent.core.common.validator.InEnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = InEnumValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InEnum {
    String message() default "值不合法";

    Class<?>[] groups() default { };

    Class enumClass() default void.class;

    String attribute() default "";

    Class<? extends Payload>[] payload() default {};
}
