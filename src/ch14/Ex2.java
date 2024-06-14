package ch14;

@FunctionalInterface
interface Calculate {
    public int cal(int num1, int num2);
}

public class Ex2 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 13;

        int result = cal(num1, num2, (int n1, int n2) -> n1 * n2);

        System.out.println(result);
    }

    static int cal(int num1, int num2, Calculate calculate) {
        return calculate.cal(num1, num2);
    }
}
