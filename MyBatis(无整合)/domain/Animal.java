package com.niit.domain;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author tree
 * @Date 2019/4/3 13:43
 * @Version 1.8
 **/
public class Animal {
    private Integer id;
    private String type;
    private String name;

    public Animal(){}
    public Animal(String type, String name) {

        this.type = type;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
