package com.niit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName MyBatisUtil
 * @Description TODO
 * @Author tree
 * @Date 2019/3/27 9:52
 * @Version 1.8
 **/
public class MyBatisUtil {
//   1. 读取配置文件
        private static String config="mybatis-config.xml";
    static Reader reader;

        static{
        try{
            reader= Resources.getResourceAsReader(config);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //   2. 根据配置文件构建SqlSessionFactory
    private static SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//       3.通过SqlSessionF创建SqlSession
    public static SqlSession getSession(){
        SqlSession session = factory.openSession();
        return session;
    }

}
