package com.xiancommon.utils.annotationUtil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangxian
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    /**
     * 字段名称
     *
     */
    String ColumnName();

    /**
     *
     * 字段类型
     */
    String DateType();

    /**
     * 字段长度
     */
    int DataLength() default 10;

    /**
     * 描述
     *
     */
    String Dec();
}
