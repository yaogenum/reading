package com.personal.yaoge.mybatis.dao.user.dao.inter;

import java.util.List;

import com.personal.yaoge.mybatis.model.entity.UsersBooksDO;

/**
 * 
 * 类UsersBooksDao.java的实现描述：users-books dao interface
 *  
 * @author yaoge 2015年5月5日 上午11:19:25
 */
public interface UsersBooksDao {
    /**
     * 查找最新的上传的书籍:各种类别最新的一本 limit 1
     * @return
     */
     public List<UsersBooksDO> findNewShangchuang() ;
     /**
      *  根据兴趣推荐limit5
      * @param interest
      * @return
      */
     public List<UsersBooksDO> findTuijian(String interest) ;
}
