package com.personal.yaoge.action.login.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.personal.yaoge.mybatis.model.entity.UsersDO;
import com.personal.yaoge.mybatis.service.inter.UsersService;

/**
 * 类UserLoginAction.java的实现描述：用户登陆
 * 
 * @author yaoge 2015年4月6日 下午10:42:39
 */

@Component
public class UserLoginAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {

    private static final long serialVersionUID = -3450061342786971896L;
    private Logger            log              = Logger.getLogger(this.getClass());
    private String            usersName;
    private String            usersPassword;
    private String            yanzhen;
    @Autowired
    private UsersService      usersService;

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
            if (StringUtils.isBlank(yanzhen) || StringUtils.isBlank(yanzhen) || StringUtils.isBlank(yanzhen)) return INPUT;
            String waitCode = (String) session.get("code");
            if (!yanzhen.equalsIgnoreCase(waitCode)) return INPUT;

            UsersDO usersDO = usersService.loadByName(usersName);
            if (null == usersDO) return INPUT;
            if (usersDO.getUsersPassword().equals(usersPassword)) {

                return SUCCESS;
            } else {
                return ERROR;
            }
        } catch (Exception e) {
            log.error(e.toString());
            return ERROR;
        } finally {
            log.info("login deal end");
        }
    }

    private ActionContext       context = ActionContext.getContext();
    private HttpServletRequest  request;
    private HttpServletResponse response;
    private SessionMap          session;

    public void setSession(Map map) {
        this.session = (SessionMap) map;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
}
