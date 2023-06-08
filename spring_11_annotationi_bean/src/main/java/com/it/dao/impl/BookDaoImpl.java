package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}
