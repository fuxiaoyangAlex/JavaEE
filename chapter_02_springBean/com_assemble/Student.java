package chapter_02_springBean.com_assemble;

import java.util.List;
import java.util.Map;



public class Student {
    private String name;
    private List<String>timetable;
    private Map<String,String>school;

    public Student(String name,List<String>timetable,Map<String,String>school) {
        this.name = name;
        this.timetable = timetable;
        this.school = school;
    }

    public Student(){
    super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTimetable() {
        return timetable;
    }

    public void setTimetable(List<String> timetable) {
        this.timetable = timetable;
    }

    public Map<String, String> getSchool() {
        return school;
    }

    public void setSchool(Map<String, String> school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", timetable=" + timetable +
                ", school=" + school +
                '}';
    }
}
