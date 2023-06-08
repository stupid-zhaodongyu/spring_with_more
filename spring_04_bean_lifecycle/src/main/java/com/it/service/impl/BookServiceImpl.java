package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    // 删除业务层使用new方式创建的dao对象
    private BookDao bookDao;
    public void save(){
        System.out.println("book service save");
    }


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
