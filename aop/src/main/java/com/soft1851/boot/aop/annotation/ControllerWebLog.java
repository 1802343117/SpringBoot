package com.soft1851.boot.aop.annotation;

import java.lang.annotation.*;

/**
 * @author 12559
 * @Description 日志注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    /**
     * 调用的接口名称
     * */
    String name();
    /**
     * 标识该日志是否需要持久化存储
     * @return boolean
     * */
    boolean isSaved() default false;
}
