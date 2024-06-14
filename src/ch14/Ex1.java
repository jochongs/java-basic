package ch14;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Arrays.setAll(arr, (i) -> i); // 람다식 사용

        System.out.println(Arrays.toString(arr));
    }
}
