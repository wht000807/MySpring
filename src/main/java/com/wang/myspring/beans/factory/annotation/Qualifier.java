package com.wang.myspring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/17/0:31
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
public @interface Qualifier {
    String value() default "";
}
