package com.springcloud.client.entity;

/**
 * 部门实体类
 */
public class Department {
    private Integer department_id; //部门ID
    private String department_name;//部门名
    private String department_en_name;//英文名

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_en_name() {
        return department_en_name;
    }

    public void setDepartment_en_name(String department_en_name) {
        this.department_en_name = department_en_name;
    }
}
