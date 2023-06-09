package com.it;

import com.it.config.SpringConfig;
import com.it.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao.select());
    }
}
