package com.fengshu.limanman.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.personal.yaoge.model.test.User;
import com.personal.yaoge.service.test.UserService;

@Component
public class LoginController extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Logger log=Logger.getLogger(this.getClass());
    
    @Autowired
    private UserTestService userTestService ;
    
    @Autowired
    private UserService userService ;

	public String  login() throws Exception{
        log.info("hello  i am limanman"+userTestService.getS());
        System.out.println(userTestService.getS());
        try{
        	User user = new User() ;
        	user.setName("111");
        	userService.save(user);
        }
        catch(Exception e) {
        	System.out.println(">>>"+e.toString());
        }
        return "success";
         
    }
 
}