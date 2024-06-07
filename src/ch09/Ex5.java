package ch09;

public class Ex5 {
    public static void main(String[] args) {
        Integer num1 = new Integer("10").intValue();
        int num2 = 10;

        int num3 = num1;

        if (num1 == num2) {
            System.out.println("same");
        }

        System.out.println(num3);
    }
}
