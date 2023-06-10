package com.it.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/*定义一个servlet容器启动的配置类 在里面加载spring的配置*/
public class ServeletContainerInitConfig extends AbstractDispatcherServletInitializer {
    /*加载springMVC容器配置*/
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringMvcConfig.class);
        return applicationContext;
    }
    /*设置那些请求归属springMVC处理*/
    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
    /*加载spring容器配置*/
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
