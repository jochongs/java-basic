package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex3 {
    Ex3() {}

    public static void main(String[] args) {
        Function<String, Integer> myFunc = Ex3::myMethod;

        System.out.println(myFunc.apply("hi"));

        Supplier<MyClass> s = MyClass::new;
    }

    static class MyClass {

    }

    static int myMethod(String str) {
        return 1;
    }
}
