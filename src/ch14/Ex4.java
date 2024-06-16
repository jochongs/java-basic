package ch14;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArr.add(i);
        }

        intArr.forEach((elem) -> {
            System.out.println(elem);
        });

        intArr.replaceAll(elem -> elem * 10);

        intArr.forEach((elem) -> {
            System.out.println(elem);
        });
    }
}
