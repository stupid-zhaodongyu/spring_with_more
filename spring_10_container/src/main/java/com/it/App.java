package com.it;

import com.it.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        /*加载类路径下的配置文件*/
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*加载文件系统下的配置文件*/
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Github\\spring_with_more\\spring_10_container\\src\\main\\resources\\applicationContext.xml");


//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        bookDao.save();
    }
}
