package com.personal.yaoge.mybatis.model.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * 类UsersHistoryDO.java的实现描述：网站读书阅读记录 
 * @author yaoge 2015年4月26日 下午6:06:37
 */
public class UsersHistoryDO implements Serializable {

    private static final long serialVersionUID = -3492662359786978896L;
    private Integer           id;
    private String            usersName;
    private String            booksName;
    private String            booksLeibie;
    private Date              startTime;
    private Date              endTime;
    private String            readStatus;
    private Integer           activeTime;

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

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getBooksLeibie() {
        return booksLeibie;
    }

    public void setBooksLeibie(String booksLeibie) {
        this.booksLeibie = booksLeibie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus;
    }

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

}
