package ch06;

public class Ex4 {
    public static void main(String[] args) {
        int int1 = 1;
        int int2 = 2;
        double dou1 = 1;
        double dou2 = 2;
        int[] intArr = new int[]{1, 2, 3, 4, 5};


        int result1 = add(int1, int2);
        System.out.println("result1 = " + result1);

        double result2 = add(int1, dou1);
        System.out.println("result2 = " + result2);

        double result3 = add(dou1, dou2);
        System.out.println("result3 = " + result3);

        int result4 = add(intArr);
        System.out.println("result4 = " + result4);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(int num1, double num2) {
        return num1 + num2;
    }

    public static  double add(double num1, double num2) {
        return num1 + num2;
    }

    public static int add(int[] intArr) {
        int sum = 0;

        for(int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        return sum;
    }
}
