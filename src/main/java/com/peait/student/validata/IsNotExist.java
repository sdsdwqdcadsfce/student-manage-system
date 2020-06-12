package com.peait.student.validata;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

@Documented
@Constraint(
        validatedBy = {IsNotExistValidata.class}
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@NotNull
public @interface IsNotExist {

    int id() default 0;
    String tableName();
    String fileName();

    String message() default "不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
