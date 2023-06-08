package com.it;

import com.it.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.registerShutdownHook();
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
//        applicationContext.close();
     }
}
