package ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        try {
            Stream<Path> file = Files.list(Path.of("../"));

            file.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
