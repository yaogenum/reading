package com.personal.yaoge.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 类User.java的实现描述：user
 * 
 * @author yaoge 2015年4月6日 下午10:54:18
 */
@Entity
@Table(name = "users")
public class UserDO implements Serializable {

    private static final long serialVersionUID = -3450061342786971896L;
    private int               id;
    private String            users_name;
    private String            users_password;
    private String            users_email;
    private String            users_sex;
    private String            users_in;
    private String            users_vip;
    private Integer           users_age;
    private Integer           users_grades;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getUsers_name() {
        return users_name;
    }

    
    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    
    public String getUsers_password() {
        return users_password;
    }

    
    public void setUsers_password(String users_password) {
        this.users_password = users_password;
    }

    
    public String getUsers_email() {
        return users_email;
    }

    
    public void setUsers_email(String users_email) {
        this.users_email = users_email;
    }

    
    public String getUsers_sex() {
        return users_sex;
    }

    
    public void setUsers_sex(String users_sex) {
        this.users_sex = users_sex;
    }

    
    public String getUsers_in() {
        return users_in;
    }

    
    public void setUsers_in(String users_in) {
        this.users_in = users_in;
    }

    
    public String getUsers_vip() {
        return users_vip;
    }

    
    public void setUsers_vip(String users_vip) {
        this.users_vip = users_vip;
    }

    
    public Integer getUsers_age() {
        return users_age;
    }

    
    public void setUsers_age(Integer users_age) {
        this.users_age = users_age;
    }

    
    public Integer getUsers_grades() {
        return users_grades;
    }

    
    public void setUsers_grades(Integer users_grades) {
        this.users_grades = users_grades;
    }

   
}
