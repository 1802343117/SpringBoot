package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 12559
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthToken {

    /**
     * 访问接口所需要的身份，默认为空，即登入即可访问，可以定义多个
     * */
    String[] role_name() default "";
}
