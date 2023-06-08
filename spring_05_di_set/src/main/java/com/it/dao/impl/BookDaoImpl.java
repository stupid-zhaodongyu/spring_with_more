package com.it.dao.impl;

import com.it.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void save() {
        System.out.println("book dao save" + name + "......"+ connectionNum);
    }
}
