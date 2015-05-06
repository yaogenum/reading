package com.personal.yaoge.action.login.action;

import java.util.ArrayList;
import java.util.List;
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
import com.personal.yaoge.mybatis.service.inter.UsersBooksService;
import com.personal.yaoge.mybatis.service.inter.UsersHistoryService;
import com.personal.yaoge.mybatis.service.inter.UsersService;
import com.personal.yaoge.utils.Validators.Validators;

/**
 * 类UserLoginAction.java的实现描述：用户登陆
 * 
 * @author yaoge 2015年4月6日 下午10:42:39
 */

@Component
public class UserLoginAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {

    private static final long   serialVersionUID = -3450061342786971896L;
    private Logger              log              = Logger.getLogger(this.getClass());
    private String              usersName;
    private String              usersPassword;
    private String              yanzhen;
    @Autowired
    private UsersService        usersService;
    @Autowired
    private UsersBooksService   usersBooksService;
    @Autowired
    private UsersHistoryService usersHistoryService;

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
        List<String> info=new ArrayList<String>();
        try {
            log.info("login deal start");
            if (StringUtils.isBlank(yanzhen) || StringUtils.isBlank(usersName) || StringUtils.isBlank(usersPassword)) return INPUT;
            String waitCode = (String) session.get("code");
            if (StringUtils.isBlank(waitCode)) return waitCode;
            if (!yanzhen.equalsIgnoreCase(waitCode)) return INPUT;

            UsersDO usersDO = usersService.loadByName(usersName);
            
            if (null == usersDO || StringUtils.isBlank(usersDO.getUsersPassword())) return INPUT;

            if (usersDO.getUsersPassword().equals(usersPassword)) {
                session.put(usersName, usersPassword);

                List<String> list = new ArrayList<String>();
                List<String> list_history = new ArrayList<String>();
                List<String> list_today = new ArrayList<String>();

                list = usersBooksService.tuijianShangchuan();

                if (!Validators.isBlankString(usersDO.getUsersIn())) {
                    list_today = usersBooksService.tuijian(usersDO.getUsersIn());
                }
                list_history = usersHistoryService.findUsersReadhistory(usersDO.getUsersName());
                
                //设置页面显示属性
                request.getSession(true).setAttribute("users_name",usersDO.getUsersName());
                request.getSession(true).setAttribute("vip",usersDO.getUsersVip());
                request.getSession(true).setAttribute("interest",usersDO.getUsersIn());
                
                request.setAttribute("list_today",list_today);
                request.setAttribute("infor_his", list_history);
                request.setAttribute("infor", list);
                request.setAttribute("info", usersDO.getUsersName());
                request.setAttribute("vip", usersDO.getUsersIn());
                request.setAttribute("users_name", usersDO.getUsersName());

                return SUCCESS;
            } else {
                info.add("userName and password don't match !!!");
                request.setAttribute("info", info);
                return ERROR;
            }
        } catch (Exception e) {
            
            log.error(e.toString());
            info.add(e.toString());
            request.setAttribute("info", info);
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
