package ch07;

public class Ex7 {
    class InstanceInner {
        int iv = 100;
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 100;
        final static int CONST = 100;
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
    }
}
