
# 笔记

1. AbstractApplicationContext#refresh 里的 finishBeanFactoryInitialization(beanFactory) 的意思是
完成 BeanFactory 的初始化
2. 延迟加载和非延迟加载在定义（Bean 注册）的时候是没有区别的，但是在依赖查找和依赖注入时，它的区别就体现出来了。
   1. 非延迟查找在spring上下文启动之前就已经初始化了
   2. 延迟加载必须在初始化完成之后来进行加载
3. 
