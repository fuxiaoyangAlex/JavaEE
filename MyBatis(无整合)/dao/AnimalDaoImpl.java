package com.niit.dao;

import com.niit.domain.Animal;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName AnimalDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/3 13:51
 * @Version 1.8
 **/
public class AnimalDaoImpl implements AnimalDao {
//   使用 SqlSession对象操作数据库
    SqlSession session;
    @Override
    public int insertAnimal(Animal animal) throws Exception {
        session= MyBatisUtil.getSession();
        int result=session.insert("insertAnimal",animal);
        session.commit();
        session.close();
        return result;
}

    @Override
    public int deleteAnimal(int id) throws Exception {
        session=MyBatisUtil.getSession();
        int result= session.delete("deleteAnimal",id);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public int updateAnimal(Animal animal) throws Exception {
        session=MyBatisUtil.getSession();
        int result = session.update("updateAnimal",animal);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public Animal getAnimalById(int id) throws Exception {
        session = MyBatisUtil.getSession();
        Animal animal = session.selectOne("getAnimalById",id);
        session.commit();
        session.close();
        return animal;
    }

    @Override
    public List<Animal> getAllAnimal() throws Exception {
        session = MyBatisUtil.getSession();
        List<Animal> animalList = session.selectList("getAllAnimal");
        session.commit();
        session.close();
        return animalList;
    }
    public List<Animal> getAnimalByName(String value)throws Exception{
        session=MyBatisUtil.getSession();
        List<Animal> animalList =session.selectList("getAnimalByName",value);
        session.commit();
        session.close();
        return animalList;
    }
}
