package ch14;

import java.util.Optional;

public class Ex7 {
    public static void main(String[] args) {
        String str = "abc";

        Optional<String> optVal = Optional.of(str);

        Optional<String> optVal2 = Optional.empty();

        System.out.println(optVal2);

        String a = null;
    }
}
