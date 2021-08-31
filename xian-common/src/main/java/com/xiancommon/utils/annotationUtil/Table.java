package com.xiancommon.utils.annotationUtil;

import java.lang.annotation.*;

/**
 * @author zhangxian
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String table_name();
}
