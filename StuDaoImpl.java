package chapter_02_springBean.com_annotation;

import org.springframework.stereotype.Repository;


@Repository("stuDao")
public class StuDaoImpl implements StuDao{
    @Override
    public void doWork() {
           System.out.println("...StuDao...doWork!");
    }

    @Override
    public void Work() {
        System.out.println("...StuDao自己的类...");
    }
}
