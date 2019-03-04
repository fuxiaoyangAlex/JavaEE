package chapter_02_springBean.com_assemble;

import java.util.List;

public class User {
    private String username;
    private Integer password;
    private List<String> list;
/*
*   使用构造注入
*   提供待所有参数的有参的构造方法
*   Alt+Insert 生成setter getter方法
* */
    public User(String username,Integer password,List<String>list){
        super();
        this.username=username;
        this.password=password;
        this.list=list;
    }
    public User(){
        super();
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
