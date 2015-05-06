package com.personal.yaoge.mybatis.service.inter.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.yaoge.mybatis.dao.user.dao.inter.UsersHistoryDao;
import com.personal.yaoge.mybatis.model.entity.UsersHistoryDO;
import com.personal.yaoge.mybatis.service.inter.UsersHistoryService;

/**
 * 类UsersHistoryServiceImpl.java的实现描述：users-history-service
 * 
 * @author yaoge 2015年5月6日 上午12:13:24
 */
public class UsersHistoryServiceImpl implements UsersHistoryService {

    @Autowired
    UsersHistoryDao usersHistoryDao;

    public List<String> findUsersReadhistory(String usersName) {
        List<UsersHistoryDO> historys = usersHistoryDao.findUserReadHistory(usersName);
        if (historys.isEmpty()) return null;
        List<String> list = new ArrayList<String>();
        for (UsersHistoryDO his : historys) {
            list.add(his.getUsersName());
            list.add(his.getBooksName());
            list.add(his.getBooksLeibie());
            list.add(new SimpleDateFormat("yyyy-MM-dd").format(his.getEndTime()));
            list.add("/save_files/"+his.getBooksName()+".txt");
        }
        return list;
    }
}
