package ch10;

import java.text.DecimalFormat;

public class Ex2 {
    public static void main(String[] args) {
        double num = 123.123123;
        double num2 = 123.8989;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(num));
        System.out.println(df.format(num2));
    }
}
