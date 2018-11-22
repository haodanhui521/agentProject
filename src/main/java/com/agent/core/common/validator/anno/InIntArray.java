package com.agent.core.common.validator.anno;


import com.agent.core.common.validator.InIntArrayValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = InIntArrayValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InIntArray{

    int[] array() default { };

    String message() default "值不合法";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default {};
}
