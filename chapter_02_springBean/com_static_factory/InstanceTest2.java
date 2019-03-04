package chapter_02_springBean.com_static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args){
        //定义配置文件路径
        String xmlPath="chapter_02_springBean/com_static_factory/beans2.xml";
        //加载配置文件时，对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean2"));
    }
}
