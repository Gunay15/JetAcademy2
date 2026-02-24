import java.util.*;

public class Human implements Comparable<Human> {
    private String name;
    private int age;
    private Double balance;

    public Human(String name, int age,Double balance) {
        this.name = name;
        this.age = age;
        this.balance=balance;
    }

    @Override
    public int compareTo(Human h) {
        return this.age - h.age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public static void main(String[] args) {
//
//        List<Human> humans = new ArrayList<>(Arrays.asList(
//                new Human("Gunay", 27,200.0),
//                new Human("Arzu", 23,170.0),
//                new Human("Gunel", 24,150.0)
//        ));
//
//        humans.sort(Comparator.comparing(Human::getAge).thenComparing(Human::getBalance));
//        humans.forEach(System.out::println);
//        Collections.sort(humans);
//        System.out.println(humans);
//        Collections.sort(humans,new SortBalanceComparator());
//        System.out.println(humans);
//    }
}