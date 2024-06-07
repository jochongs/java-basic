package ch09;

public class Ex3 {
    final static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        sb.append(123);
        sb.append(111);

        System.out.println(sb.capacity());

        sb.append(222);
        sb.append("Hello World");

        System.out.println(sb.capacity());

        System.out.println(sb);
    }
}
