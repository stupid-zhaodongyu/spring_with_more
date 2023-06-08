package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.dao.UserDao;
import com.it.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {
    // 删除业务层使用new方式创建的dao对象
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

}
