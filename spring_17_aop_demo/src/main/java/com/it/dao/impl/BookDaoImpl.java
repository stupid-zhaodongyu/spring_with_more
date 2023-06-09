package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("book dao save ..." + name);

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        System.out.println("total time is " + totalTime);
    }
    public void update(){
        System.out.println("book dao update");
    }
    public void delete(){
        System.out.println("book dao delete");
    }
    public void select(){
        System.out.println("book dao select");
    }
}
