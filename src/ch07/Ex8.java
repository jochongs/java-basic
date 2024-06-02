package ch07;

public class Ex8 {
    public static void main(String[] args) {
        Object obj = new Object() {
            @Override
            public String toString() {
                return "HI";
            }
        };

        System.out.println(obj.toString());
    }
}
