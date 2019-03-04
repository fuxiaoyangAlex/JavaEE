package chapter_02_springBean.com_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args){
        //定义文件路径
        String xmlPath="chapter_02_springBean/com_scope/Bean4.xml";
        //加载文件路径
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));

    }
}
