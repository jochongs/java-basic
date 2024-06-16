package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 2);
        }

        list.stream().forEach(System.out::println);

        Stream<List<Integer>> stream = Stream.of(list);

        Random random = new Random();

        random.doubles(5).forEach(System.out::print);
    }
}
