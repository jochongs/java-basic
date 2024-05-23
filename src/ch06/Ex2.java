package ch06;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result1 = add(num1, num2);
        System.out.println("result1 = " + result1);
        
        int result2 = sub(num1, num2);
        System.out.println("result2 = " + result2);

        int result3 = multiple(num1, num2);
        System.out.println("result3 = " + result3);

        int result4 = div(num1, num2);
        System.out.println("result4 = " + result4);

        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
