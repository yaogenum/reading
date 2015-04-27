package com.personal.yaoge.mybatis.model.entity;

import java.io.Serializable;

/**
 * 
 * 类UsersBooksDO.java的实现描述：users-mapper-books-entity 
 * @author yaoge 2015年4月26日 下午5:18:39
 */
public class UsersBooksDO implements Serializable {

    private static final long serialVersionUID = -3494361342786971196L;
    private Integer           id;
    private String            booksName;
    private String            booksTag;
    private String            booksAuthor;
    private Integer           booksAmount;
    private String            booksStoragetime;
    private String            booksText;
    private String            booksPath;
    private String            books_pic;
    private Integer           books_xiazai;
    private Integer           books_limit;
    private String            books_uploader;
    private String            books_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getBooksTag() {
        return booksTag;
    }

    public void setBooksTag(String booksTag) {
        this.booksTag = booksTag;
    }

    public String getBooksAuthor() {
        return booksAuthor;
    }

    public void setBooksAuthor(String booksAuthor) {
        this.booksAuthor = booksAuthor;
    }

    public Integer getBooksAmount() {
        return booksAmount;
    }

    public void setBooksAmount(Integer booksAmount) {
        this.booksAmount = booksAmount;
    }

    public String getBooksStoragetime() {
        return booksStoragetime;
    }

    public void setBooksStoragetime(String booksStoragetime) {
        this.booksStoragetime = booksStoragetime;
    }

    public String getBooksText() {
        return booksText;
    }

    public void setBooksText(String booksText) {
        this.booksText = booksText;
    }

    public String getBooksPath() {
        return booksPath;
    }

    public void setBooksPath(String booksPath) {
        this.booksPath = booksPath;
    }

    public String getBooks_pic() {
        return books_pic;
    }

    public void setBooks_pic(String books_pic) {
        this.books_pic = books_pic;
    }

    public Integer getBooks_xiazai() {
        return books_xiazai;
    }

    public void setBooks_xiazai(Integer books_xiazai) {
        this.books_xiazai = books_xiazai;
    }

    public Integer getBooks_limit() {
        return books_limit;
    }

    public void setBooks_limit(Integer books_limit) {
        this.books_limit = books_limit;
    }

    public String getBooks_uploader() {
        return books_uploader;
    }

    public void setBooks_uploader(String books_uploader) {
        this.books_uploader = books_uploader;
    }

    public String getBooks_type() {
        return books_type;
    }

    public void setBooks_type(String books_type) {
        this.books_type = books_type;
    }

}
