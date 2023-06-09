package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class BookDaoImpl implements BookDao {
    public int select() {
        return 100;
    }
    public void update(){
        System.out.println("update");
    }
}
