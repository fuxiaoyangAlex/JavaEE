package chapter_02_springBean.com_assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args){
    String xmlPath="chapter_02_springBean/com_assemble/Bean5.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("设置值注入");
        Student stu1 =(Student) ac.getBean("student1");
       /* 没有设置Bean的id和name，不用强制转换
        Student student = ac.getBean(Student.class);
        */
        System.out.println(stu1);
        System.out.println("构造方法注入");
      System.out.println(ac.getBean("student2"));
    }
}
