import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class Product {
    String product;
    Double price;
    int count;

    public Product(String product, double price, int count) {
        this.product = product;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}


