package ch09;

public class Ex4 {
    public static void main(String[] args) {
        int abs = Math.abs(-10);

        System.out.println(abs);

        int num1 = 2;
        int num2 = 6;

        int result1 = calculate(num1, num2, Ex4::sum);
        int result2 = calculate(num1, num2, (int num3, int num4) -> num3 * num4);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface CalculateFunc {
        int cal(int num1, int num2);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int calculate(int num1, int num2, CalculateFunc calculateFunc) {
        return calculateFunc.cal(num1, num2);
    }
}
