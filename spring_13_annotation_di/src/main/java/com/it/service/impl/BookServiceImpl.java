package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Component
@Repository
@Controller
public class BookServiceImpl implements BookService{
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;
    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
