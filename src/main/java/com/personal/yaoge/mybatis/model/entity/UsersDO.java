package com.personal.yaoge.mybatis.model.entity;

import java.io.Serializable;

public class UsersDO implements Serializable {

    private static final long serialVersionUID = -3452361342786978896L;
    private Integer               id;
    private String            usersName;
    private String            usersPassword;
    private String            usersEmail;
    private String            usersSex;
    private String            usersIn;
    private String            usersVip;
    private Integer            usersAge;
    private Integer            usersGrades;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
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

    
    public Integer getUsersAge() {
        return usersAge;
    }

    
    public void setUsersAge(Integer usersAge) {
        this.usersAge = usersAge;
    }

    
    public Integer getUsersGrades() {
        return usersGrades;
    }

    
    public void setUsersGrades(Integer usersGrades) {
        this.usersGrades = usersGrades;
    }
    
}
