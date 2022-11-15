package com.xiancommon.utils.annotationUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @author zhangxian
 */
public class MyMain {
    private final static Logger log = LoggerFactory.getLogger("MyMain.class");

    public static void main(String[] args) {
        log.info(buildSql());
    }

    public static String buildSql() {
        StringBuffer str = new StringBuffer("create table ");
        Class<People> peopleClass = People.class;
        Table table = peopleClass.getAnnotation(Table.class);
        str.append(table.table_name() + "(");
        Field[] fields = peopleClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Column.class)) {
                Column column;
                column = (Column) field.getAnnotation(Column.class);
                str.append(column.ColumnName()).append(" ").append(column.DateType()).
                        append("(").append(column.DataLength()).append("),--").append(column.Dec())
                        .append("\n");
            }
        }
        String sql = str.substring(0,str.length() - 1) + ")";
        return sql.toString();

    }
}
