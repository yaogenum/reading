package com.personal.yaoge.mybatis.service.inter;

import java.util.List;

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
    
    public List<String> tuijian(String interest) ;
 }
