package ch02;

public class Ex3 {
    public static void main(String[] args) {
        int intNum = 12;
        long longNum = 1234L;
        short shortNum = 123;
        byte byteNum = 1;
        float floatNum = 123.123f;
        double doubleNum = 123.123123d;

        // long + int -> long + long -> long
        long result1 = intNum + longNum;

        // short + byte -> int + int -> int
        int result2 = shortNum + byteNum;

        // float + dobule -> double + double -> double
        double result3 = floatNum + doubleNum;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
