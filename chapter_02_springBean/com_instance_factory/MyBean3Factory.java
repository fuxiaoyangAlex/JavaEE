package chapter_02_springBean.com_instance_factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("bean3工厂实例化中");
    }
//    创建Bean3实例化的方法
    public Bean3 createBean(){
        return new Bean3();
    }
}
