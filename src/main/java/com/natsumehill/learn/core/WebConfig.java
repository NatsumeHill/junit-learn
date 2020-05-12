package com.natsumehill.learn.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring MVC注解方式配置
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.natsumehill.learn.rest")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                // 不拦截登录接口和首页
        .excludePathPatterns("/login/*", "/");
        super.addInterceptors(registry);
    }
}
