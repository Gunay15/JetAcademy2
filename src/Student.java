import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String surName;
    int age;
    private static final ArrayList<Student> db = new ArrayList<>();

    Student(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;

    }
    public static void addStudent(Student s){
       db.add(s) ;
    }

    public static List<Student> getStudent(){
        return db;
    }

    @Override
    public String toString() {
        return
                "name=" + name + '\'' +
                " surName=" + surName + '\'' +
                "age=" + age ;
    }
}