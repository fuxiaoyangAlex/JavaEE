package chapter_02_springBean.com_annotation;

import java.util.Map;

public class StrudentTest {
    public String name;
    public Integer age;

    public StrudentTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}
