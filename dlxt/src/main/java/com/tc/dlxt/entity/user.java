package com.tc.dlxt.entity;

/**
 * User 实体类
 *
 * @version 1.0
 * @date 2019-05-13 22:55:23
 */
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
    private String phone;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}