public class Emplyoee {
    String name;
    String surName;
    int age;
    String departament;
    double salary;

    Emplyoee(String name, String surName, int age, String departament, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.departament = departament;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", departament='" + departament + '\'' +
                ", salary=" + salary ;
    }
}
