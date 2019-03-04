package chapter_02_springBean.com_instance_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3
{
    public static void main(String[] args){
        //配置文件路径
        String xmlPath="chapter_02_springBean/com_instance_factory/beans3.xml";
        //加载配置文件时，对Bean实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean3"));

        System.out.println(applicationContext.getBean("car3"));
    }
}
