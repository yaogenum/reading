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
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -3450061342786971896L;
    private int               id;
    private String            name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

}
