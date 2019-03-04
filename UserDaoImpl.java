package chapter_02_springBean.com_annotation;

import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl implements UserDao{
    public void save(){
        System.out.println("userdao....save.....");
    }
}
