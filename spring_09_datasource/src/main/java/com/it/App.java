package com.it;

import com.it.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
          BookDao bookDao = (BookDao)applicationContext.getBean("bookDao");
          bookDao.save();
     }
}
