package com.it;

import com.it.config.SpringConfig;
import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao)applicationContext.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService)applicationContext.getBean(BookService.class);
        bookService.save();

        applicationContext.close();
    }
}
