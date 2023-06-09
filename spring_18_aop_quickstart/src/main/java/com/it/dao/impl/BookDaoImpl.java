package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
//        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save");
    }
    public void update(){
        System.out.println("book dao update");
    }
}
