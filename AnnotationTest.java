package chapter_02_springBean.com_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args){
    String xmlPath="chapter_02_springBean/com_annotation/Bean6.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //获取UserController实例
        UserController userController =(UserController)ac.getBean("userController");
        userController.save();
        System.out.println();
        //获取StuController实例
        StuController stuController =(StuController) ac.getBean("stuController");
        stuController.doWork();
    }
}
