package com.it;

import com.it.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForUserDao {
    public static void main(String[] args) {
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        UserrDao userrDao = userDaoFactory.getUserDao();
//        userrDao.save();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userrDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userrDao2 = (UserDao) applicationContext.getBean("userDao");
//        userrDao.save();
        System.out.println(userrDao);
        System.out.println(userrDao2);
     }
}
