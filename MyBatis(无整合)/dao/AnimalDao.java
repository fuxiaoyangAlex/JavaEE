package com.niit.dao;

import com.niit.domain.Animal;

import java.util.List;

public interface AnimalDao {
    int insertAnimal(Animal animal)throws Exception;
    int deleteAnimal(int id)throws Exception;
    int updateAnimal(Animal animal)throws Exception;

    Animal getAnimalById(int id)throws Exception;
    List<Animal> getAllAnimal()throws Exception;
    List<Animal> getAnimalByName(String value)throws Exception;
}
