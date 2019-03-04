package chapter_02_springBean.com_assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssembleTest {
    public static void main(String[] args){
      String xmlPath="chapter_02_springBean/com_assemble/Bean5.xml";
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
      System.out.println(applicationContext.getBean("user1"));
      User user2=(User) applicationContext.getBean("user2");
      System.out.println(user2);
    }
}
