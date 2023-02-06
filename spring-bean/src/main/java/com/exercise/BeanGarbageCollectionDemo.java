package com.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean 垃圾回收
 */
public class BeanGarbageCollectionDemo {
    public static void main(String[] args) throws InterruptedException {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册 configuration class 配置类
        context.register(BeanInitializationDemo.class);
        // 启动 spring 应用上下文
        context.refresh();
        context.close();
        Thread.sleep(5000L);
        // 强制触发GC
        System.gc();
        Thread.sleep(5000L);
    }
}
