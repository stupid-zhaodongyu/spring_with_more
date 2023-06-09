package com.it.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.it")
//@PropertySource：加载类路径jdbc.properties文件
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
