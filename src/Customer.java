import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    String name;
    double balance;

    public Customer(String name,double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void buy(){

    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
