package com.it.dao.impl;

import com.it.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl(){
        System.out.println("book dao constructor is running");
    }
    public void save() {
        System.out.println("book dao save");
    }
}
