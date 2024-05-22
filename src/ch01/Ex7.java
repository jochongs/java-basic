package ch01;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int inputNumber = scanner.nextInt();

        System.out.println("input = " + input);
        System.out.println("inputNumber = " + inputNumber);

        scanner.close();
    }
}
