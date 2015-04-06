package com.personal.yaoge.action.login.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.personal.yaoge.model.entity.User;
import com.personal.yaoge.service.user.service.UserService;

/**
 * 
 * 类UserLoginAction.java的实现描述：用户登陆
 * @author yaoge 2015年4月6日 下午10:42:39
 */

@Component
public class UserLoginAction extends ActionSupport {
	private static final long serialVersionUID = -3450061342786971896L;
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private UserService userService;

	/**
	 * detail deal user.login
	 */
	@Override
	public String execute() throws Exception {
		try {
			log.info("login deal end");
			User user = new User();
			user.setName("111");
			userService.save(user);
			log.info("login deal end");
		} catch (Exception e) {
			log.error(e.toString());
		}
		return "success";
	}
}
