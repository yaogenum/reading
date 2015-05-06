package com.personal.yaoge.mybatis.service.inter;

import java.util.List;

import com.personal.yaoge.mybatis.model.entity.UsersHistoryDO;

/**
 * 
 * 类UsersHistoryService.java的实现描述：users-history-service 
 * @author yaoge 2015年5月5日 下午2:37:41
 */
public interface UsersHistoryService {
    /**
     * 根据阅读历史获取书籍 limit 3
     * @param usersName
     * @return
     */
    public List<String> findUsersReadhistory(String usersName) ;
}
