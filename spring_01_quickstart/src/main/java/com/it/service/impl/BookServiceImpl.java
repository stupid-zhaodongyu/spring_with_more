package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.dao.impl.BookDaoImpl;
import com.it.service.BookService;

public class BookServiceImpl implements BookService {
    // 删除业务层使用new方式创建的dao对象
    private BookDao bookDao;
    public void save(){
        System.out.println("book service save");
    }


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
