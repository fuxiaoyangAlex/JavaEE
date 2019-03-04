package chapter_02_springBean.com_instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args){
        //定义配置文件路径
       String xmlPath="chapter_02_springBean/com_instance/beans1.xml";
        //加载配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Bean1 bean = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean);
    }
}
