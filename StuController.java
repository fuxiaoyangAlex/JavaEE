package chapter_02_springBean.com_annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("stuController")
public class StuController {
    @Resource (name="stuService")
    private StuService stuService;
    public void doWork(){
        stuService.doWork();
        System.out.println("...stuController...doWork!");
    }
}
