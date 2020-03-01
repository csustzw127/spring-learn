package com.learn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(ctx.getBean(MyBean.class));
        System.out.println(ctx.getBean("myBean"));
        ctx.close();
    }
}
