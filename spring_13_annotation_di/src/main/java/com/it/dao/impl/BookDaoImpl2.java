package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Value("nihao")
    private String name;
    public void save() {
        System.out.println("book dao save 2 ..." + name);
    }
}
