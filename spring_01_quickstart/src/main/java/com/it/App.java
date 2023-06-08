package com.it;

import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
     }

}
