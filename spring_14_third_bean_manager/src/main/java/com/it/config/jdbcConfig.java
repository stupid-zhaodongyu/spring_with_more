package com.it.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.it.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class jdbcConfig {
    /*1定义一个方法获得要管理的对象
    * 2添加@Bean 表示当前方法的返回值是一个bean
    *
    * */
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/learnjdbc")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
