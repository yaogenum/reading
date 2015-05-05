package com.personal.yaoge.mybatis.dao.user.dao.inter;

import java.util.List;

import com.personal.yaoge.mybatis.model.entity.UsersHistoryDO;

/**
 * 类UsersHistoryDao.java的实现描述：users-history-dao
 * 
 * @author yaoge 2015年5月5日 下午1:53:33
 */
public interface UsersHistoryDao {
    /**
     * 根据用户阅读历史查找书籍 limit 3
     * @param UsersName
     * @return
     */
    public List<UsersHistoryDO> findUserReadHisttory(String UsersName) ;
}
