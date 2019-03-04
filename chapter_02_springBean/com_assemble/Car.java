package chapter_02_springBean.com_assemble;

import java.util.List;

public class Car {
    private String model;
    private String color;
    private Integer price;
    private List<String> list;

    public Car(String model,String color, Integer price, List<String> list){
        super();
        this.model=model;
        this.color=color;
        this.price=price;
        this.list=list;
    }
    public Car(){
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", list=" + list +
                '}';
    }
}
