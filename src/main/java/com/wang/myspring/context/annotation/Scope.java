package com.wang.myspring.context.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/23:29
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
