package com.personal.yaoge.mybatis.service.inter.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.personal.yaoge.mybatis.dao.user.dao.inter.UsersBooksDao;
import com.personal.yaoge.mybatis.model.entity.UsersBooksDO;
import com.personal.yaoge.mybatis.service.inter.UsersBooksService;

/**
 * 
 * 类UsersBooksServiceImpl.java的实现描述：users books service 
 * @author yaoge 2015年5月6日 上午12:11:59
 */
public class UsersBooksServiceImpl implements UsersBooksService{
    @Autowired
    UsersBooksDao usersBooksDao ;
    
    private String[] booksTypes ={"it","math","economy","fiction","literature","scientist","tool"};
    
    public List<String> tuijianShangchuan() {
        List<String> list = new ArrayList<String>() ;
        for(String booksType : booksTypes) {
            List<UsersBooksDO> books = usersBooksDao.findNewShangchuang(booksType);
            if(!books.isEmpty()){
                list.add(books.get(0).getBooksName());
                list.add(books.get(0).getBooksTag());
                list.add(books.get(0).getBooksAuthor());
                list.add(books.get(0).getBooksAmount().toString());
                list.add(books.get(0).getBooksStoragetime());
                list.add(books.get(0).getBooksPath());
                list.add(books.get(0).getBooksText());
                list.add(books.get(0).getBooks_pic());
                list.add(books.get(0).getBooks_xiazai().toString());
                list.add(books.get(0).getBooks_limit().toString());
            }
        }
        return list;
    }

    public List<String> tuijian(String interest) {
        List<String> list = new ArrayList<String>() ;
        List<UsersBooksDO> usersBooks = usersBooksDao.findTuijian(interest);
        if(usersBooks.isEmpty()) return null;
        for(UsersBooksDO books : usersBooks) {
            list.add(books.getBooksName());
            list.add(books.getBooksTag());
            list.add(books.getBooksAuthor());
            list.add(books.getBooksAmount().toString());
            list.add(books.getBooksStoragetime());
            list.add(books.getBooksPath());
            list.add(books.getBooksText());
            list.add(books.getBooks_pic());
            list.add(books.getBooks_xiazai().toString());
            list.add(books.getBooks_limit().toString());
        }
        return list;
    }

}
