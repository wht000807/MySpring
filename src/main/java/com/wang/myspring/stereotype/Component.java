package com.wang.myspring.stereotype;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: wht
 * @Date: 2021/08/16/23:36
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {
    String value() default "";
}
