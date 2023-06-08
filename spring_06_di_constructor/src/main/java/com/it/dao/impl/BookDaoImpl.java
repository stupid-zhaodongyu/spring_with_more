package com.it.dao.impl;

import com.it.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String name;

    public BookDaoImpl(int connectionNum, String name) {
        this.connectionNum = connectionNum;
        this.name = name;
    }

    public void save() {
        System.out.println("book dao save" + "......" +name + "......"+ connectionNum);
    }
}
