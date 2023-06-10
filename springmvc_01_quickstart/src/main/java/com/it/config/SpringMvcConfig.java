package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*创建springmvc的配置文件 加载controller对应的bean*/
@Configuration
@ComponentScan("com.it.controller")
public class SpringMvcConfig {
}
