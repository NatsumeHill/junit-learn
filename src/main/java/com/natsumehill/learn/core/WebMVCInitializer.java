package com.natsumehill.learn.core;

import com.natsumehill.learn.AnnotationApp;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 该类为Web容器配置Spring MVC、Spring IoC
 * 借助的是Web容器Servlet SPI机制
 */
public class WebMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                AnnotationApp.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/*"
        };
    }
}
