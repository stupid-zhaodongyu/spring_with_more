package com.it;

import com.it.config.SpringConfig;
import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotationDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = (BookDao)applicationContext.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService)applicationContext.getBean(BookService.class);
        bookService.save();

//        applicationContext.close();
    }
}
