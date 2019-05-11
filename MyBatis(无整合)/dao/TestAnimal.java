package com.niit.dao;

import com.niit.domain.Animal;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName TestAnimal
 * @Description TODO
 * @Author tree
 * @Date 2019/4/3 14:13
 * @Version 1.8
 **/
public class TestAnimal {
    AnimalDao animalDao=new AnimalDaoImpl();
    @Test
    public void insertAnimal()throws Exception{
        try{
            Animal animal = new Animal("拉布拉多","小黑");
            animalDao.insertAnimal(animal);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void deleteAniam()throws Exception{
        try{
            animalDao.deleteAnimal(1);
        }catch (IOException e){
            e.printStackTrace();
        }
           System.out.println("删除成功！");
    }
    @Test
    public void updateAniam()throws Exception{
        Animal animal = new Animal();
        animal.setId(4);
        animal.setType("阿拉斯加");
        animal.setName("憨憨");
            try{
                animalDao.updateAnimal(animal);
            }catch (IOException e){
                e.printStackTrace();
            }
    }
    @Test
    public void getAnimalById()throws Exception{
        try{
           Animal animal=animalDao.getAnimalById(2);
            System.out.println(animal);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void getAllAnimal()throws Exception{
        try{
            List<Animal> animalList = animalDao.getAllAnimal();
            animalList.forEach(animal ->    System.out.println(animal));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void getAnimalByName()throws Exception{
        try{
            List<Animal> animalList =animalDao.getAnimalByName("二哈");
            animalList.forEach(animal ->    System.out.println(animal));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
