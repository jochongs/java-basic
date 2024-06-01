package ch07;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        Person buyer = new Person("jochong");

        Tv tv = new Tv();
        Monitor monitor = new Monitor();

        buyer.buy(tv);
        buyer.buy(monitor);

        System.out.println(buyer.buyCount());
    }

    static class Product {
        int price;
        int bonusPoint;

        Product(int price) {
            this.price = price;
            bonusPoint = (int) (price / 10.0);
        }
    }

    static class Person {
        final String name;
        ArrayList<Product> buyProducts = new ArrayList<>();

        Person(String name) {
            this.name = name;
        }

        void buy(Product product) {
            buyProducts.add(product);
        }

        int buyCount() {
            return buyProducts.size();
        }
    }

    static class Tv extends Product {
        Tv() {
          super(100_000);
        }
    }

    static class Monitor extends Product {
        Monitor() {
            super(10_000);
        }
    }
}
