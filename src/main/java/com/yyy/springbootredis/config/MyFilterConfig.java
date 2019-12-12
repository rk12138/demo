package com.yyy.springbootredis.config;

import com.yyy.springbootredis.filter.MyFilter1;
import com.yyy.springbootredis.filter.MyFilter2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

//有多个filter时，可通过setOrder(int i)设置执行顺序

@Configuration
public class MyFilterConfig {
    @Autowired
    private MyFilter1 myFilter1;

    @Autowired
    private MyFilter2 myFilter2;

    @Bean
    public FilterRegistrationBean<MyFilter1> setFilter1() {
        FilterRegistrationBean<MyFilter1> filter1FilterRegistrationBean = new FilterRegistrationBean<>();
        filter1FilterRegistrationBean.setOrder(2);
        filter1FilterRegistrationBean.setFilter(myFilter1);
        filter1FilterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/api/*")));

        return filter1FilterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter2> setFilter2() {
        FilterRegistrationBean<MyFilter2> filter1FilterRegistrationBean = new FilterRegistrationBean<>();
        filter1FilterRegistrationBean.setOrder(1);
        filter1FilterRegistrationBean.setFilter(myFilter2);
        filter1FilterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/api/*")));

        return filter1FilterRegistrationBean;
    }


}
