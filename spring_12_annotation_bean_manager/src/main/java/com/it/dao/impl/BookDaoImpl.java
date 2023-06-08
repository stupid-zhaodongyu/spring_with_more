package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.*;

@Component("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
    @PostConstruct
    public void init() {
        System.out.println("book dao init ...");
    }
    @PreDestroy
    public void destory() {
        System.out.println("book dao destory ...");
    }
}
