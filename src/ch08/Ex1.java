package ch08;

public class Ex1 {
    public static void main(String[] args) {
        try {
            int a = 0 / 0;
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
