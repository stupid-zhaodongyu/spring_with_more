package com.it.dao.impl;

import com.it.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save");
    }

    public void init() {
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
