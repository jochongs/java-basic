package ch05;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {1, 2},
                {1, 2}
        };

        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.deepToString(score));
    }
}
