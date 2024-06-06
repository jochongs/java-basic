package ch07;

public class Ex9 {
    public static void main(String[] args) {

    }
}

class Child3 extends Parent3 implements MyInterface2, MyInterface {
    @Override
    public void method1() {
        MyInterface2.super.method1(); // default 메서드가 겹친 경우 오버라이딩 필수
    }
}

class Parent3 {
    public void method2() {
        System.out.println("Method2() in Parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
