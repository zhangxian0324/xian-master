package com.xiancommon.utils.annotationUtil;

import java.io.Serializable;
/**
 * @author zhangxian
 */
@Table(table_name = "people")
public class People implements Serializable {

    private static final long serialVersionUID = -5883213351373207257L;
    @Column(ColumnName = "id",DateType = "int",DataLength=20,Dec = "ID")
    private int id;

    @Column(ColumnName = "name",DateType = "vachar",DataLength=300,Dec = "用户姓名")
    private String name;

    @Column(ColumnName = "passwd",DateType = "vachar",DataLength=200,Dec = "用户密码")
    private String passwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
