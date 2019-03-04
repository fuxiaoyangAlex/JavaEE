package chapter_02_springBean.com_annotation;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("stuService")
public class StuServiceImpl implements StuService {
    @Resource(name = "stuDao")
    private StuDao stuDao;
    public void doWork() {
       this.stuDao.doWork();
            stuDao.Work();
        System.out.println("...stuService...doWork");
    }
}
