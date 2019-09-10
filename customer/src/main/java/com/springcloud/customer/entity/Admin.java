package com.springcloud.customer.entity;

public class Admin {
    private String admin_id;						//管理员id
    private String admin_name;						//管理员姓名
    private String admin_pwd;						//管理员密码
    private String admin_permissions;		//权限等级
    private String admin_telephone;			//电话
    private String create_time;          //创建时间
    private String last_modify_time	;		//最后修改时间
    private String reserved;						//预留字段
    private Integer	storeId;				//门店id

    private String store_name;//衍生属性  接收门店名称

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    public String getAdmin_permissions() {
        return admin_permissions;
    }

    public void setAdmin_permissions(String admin_permissions) {
        this.admin_permissions = admin_permissions;
    }

    public String getAdmin_telephone() {
        return admin_telephone;
    }

    public void setAdmin_telephone(String admin_telephone) {
        this.admin_telephone = admin_telephone;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLast_modify_time() {
        return last_modify_time;
    }

    public void setLast_modify_time(String last_modify_time) {
        this.last_modify_time = last_modify_time;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }
}
