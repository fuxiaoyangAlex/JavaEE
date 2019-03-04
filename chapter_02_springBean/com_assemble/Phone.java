package chapter_02_springBean.com_assemble;

public class Phone {
    private String brand;
    private String color;
    private Integer memory;

    public Phone(String brand,String color, Integer memory) {
        this.brand = brand;
        this.color = color;
        this.memory = memory;
    }
    public Phone(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                '}';
    }
}
