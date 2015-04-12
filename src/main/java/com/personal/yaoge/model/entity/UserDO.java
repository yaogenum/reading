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
    private String            usersName;
    private String            usersPassword;
    private String            usersEmail;
    private String            usersSex;
    private String            usersIn;
    private String            usersVip;
    private String            usersAge;
    private String            usersGrades;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex;
    }

    public String getUsersIn() {
        return usersIn;
    }

    public void setUsersIn(String usersIn) {
        this.usersIn = usersIn;
    }

    public String getUsersVip() {
        return usersVip;
    }

    public void setUsersVip(String usersVip) {
        this.usersVip = usersVip;
    }

    public String getUsersAge() {
        return usersAge;
    }

    public void setUsersAge(String usersAge) {
        this.usersAge = usersAge;
    }

    public String getUsersGrades() {
        return usersGrades;
    }

    public void setUsersGrades(String usersGrades) {
        this.usersGrades = usersGrades;
    }

}
