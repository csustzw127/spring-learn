package com.learn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean(name="myBean")
    @Scope("prototype")
    public MyBean createMyBean()
    {
        return new MyBean();

    }

}
