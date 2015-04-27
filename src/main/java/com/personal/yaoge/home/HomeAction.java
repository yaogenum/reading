package com.personal.yaoge.home;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * 类HomeAction.java的实现描述：默认页面转向 
 * @author yaoge 2015年4月26日 下午4:56:29
 */
public class HomeAction extends ActionSupport{
    private static final long serialVersionUID = -3450061342786971827L;
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
