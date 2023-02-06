package com.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanInitializationDemo {
    @Bean
//    @Lazy
    public UserFactory userFactory() {
        return new DefaultUserFactory();
    }

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanInitializationDemo.class);
        // 启动 spring 应用上下文
        context.refresh();
        // 非延迟初始化在 spring 应用上下文启动完成后，被初始化
        System.out.println("spring 应用上下文已启动");
        // 依赖查找 UserFactory
        UserFactory userFactory = context.getBean(UserFactory.class);
        System.out.println(userFactory);
        System.out.println("spring 应用上下文准备关闭");
        context.close();
        System.out.println("spring 应用上下文已关闭");
    }

}
