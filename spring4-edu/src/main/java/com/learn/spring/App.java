package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    // 此示例主要演示以下内容：
    // 1.Hello World
    // 2.配置文件(application.properties)的使用 及 多环境配置文件的设置
    // 3.基本的MVC Controller单元测试 及 针对某个Class的单元测试
    // 4.Spring Boot的热部署(修改代码后只需Build一下无须重新Run)
    public static void main( String[] args )
    {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
//        System.out.println(ctx.getBean(MyBean.class));
//        System.out.println(ctx.getBean("myBean"));
//        ctx.close();
        SpringApplication.run(App.class, args);
    }
}
