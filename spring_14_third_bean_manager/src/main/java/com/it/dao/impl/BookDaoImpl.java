package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("book dao save ..." + name);
    }
}
