package com.personal.yaoge.action.login.action;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.personal.yaoge.model.entity.UserDO;
import com.personal.yaoge.service.user.service.UserService;

/**
 * 类UserLoginAction.java的实现描述：用户登陆
 * 
 * @author yaoge 2015年4月6日 下午10:42:39
 */

@Component
public class UserLoginAction extends ActionSupport {

    private static final long serialVersionUID = -3450061342786971896L;
    private Logger            log              = Logger.getLogger(this.getClass());
    private String            usersName;
    private String            usersPassword;
    private String            yanzhen;
    @Autowired
    private UserService       userService;

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

    public String getYanzhen() {
        return yanzhen;
    }

    public void setYanzhen(String yanzhen) {
        this.yanzhen = yanzhen;
    }

    /**
     * detail deal user.login
     */
    @Override
    public String execute() throws Exception {
        try {
            log.info("login deal start");
            UserDO user = new UserDO();
            user.setUsersName(usersName);
            user.setUsersPassword(usersPassword);
            userService.save(user);
            try{
                UserDO userDO = userService.loadByName(usersName);
                userDO.getUsersName();
            }
            catch(Exception e) {
                log.error(e);
            }
            
            
            return SUCCESS;
        } catch (Exception e) {
            log.error(e.toString());
            return ERROR;
        } finally {
            log.info("login deal end");
        }
    }
}
