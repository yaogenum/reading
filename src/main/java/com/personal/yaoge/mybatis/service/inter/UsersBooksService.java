package com.personal.yaoge.mybatis.service.inter;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * 类UsersBooksService.java的实现描述：users-books-service 
 * @author yaoge 2015年5月5日 下午2:35:30
 */
public interface UsersBooksService {
    /**
     * 推荐上传书籍 limit 1
     * @return
     */
    public List<String> tuijianShangchuan() ;
    
    /**
     * 根据兴趣爱好推荐 limit 5
     * @param interest
     * @return
     */
    public List<String> tuijian(String interest) ;
 }
