package ch07;

public class Ex3 {
    public static final int a = 1;
    public static final int b = 2;

    public static void main(String[] args) {
        System.out.println(sum(a, b));;
    }

    final static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
