package chapter_02_springBean.com_assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneTest {
    public static void main(String[] args){
        String xmlPath="chapter_02_springBean/com_assemble/Bean5.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);

        StuPhone stuPhone1 =(StuPhone) ac.getBean("stuPhone1");
        StuPhone stuPhone2 =(StuPhone)ac.getBean("stuPhone2");
        StuPhone stuPhone3 = (StuPhone)ac.getBean("stuPhone3");

        Phone phone1 =(Phone)ac.getBean("phone1");
        Phone phone2 =(Phone)ac.getBean("phone2");
        Phone phone3 = (Phone)ac.getBean("phone3");

        stuPhone1.setPhone(phone1);
        stuPhone2.setPhone(phone2);
        stuPhone3.setPhone(phone3);

        System.out.println("第一个学生的手机"+stuPhone1);
        System.out.println("第二个学生的手机"+stuPhone2);
        System.out.println("第三个学生的手机"+stuPhone3);

    }
}
