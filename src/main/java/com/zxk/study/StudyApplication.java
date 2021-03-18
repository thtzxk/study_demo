package com.zxk.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author zxk
 */
@SpringBootApplication
public class StudyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StudyApplication.class);
    }
}
