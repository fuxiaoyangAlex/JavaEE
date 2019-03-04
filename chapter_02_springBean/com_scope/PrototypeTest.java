package chapter_02_springBean.com_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
    public static void main(String[] args){
        String xmlPath="chapter_02_springBean/com_scope/Bean4.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("prototype"));
        System.out.println(applicationContext.getBean("prototype"));
    }
}
