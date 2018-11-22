package com.agent.core.common.validator.anno;


import com.agent.core.common.validator.InStringArrayValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = InStringArrayValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InStringArray {

    String[] array() default { };

    String message() default "值不合法";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default {};
}
