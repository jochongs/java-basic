package ch05;

public class Ex3 {
    public static void main(String[] args) {
        String str = "hello world";

        char charA = str.charAt(0);
        System.out.println("charA = " + charA);
        
        int length = str.length();
        System.out.println("length = " + length);
        
        String subStr = str.substring(0, 3);
        System.out.println("subStr = " + subStr);

        boolean same = str.equals("hello world");
        System.out.println("same = " + same);

        char[] charArr = str.toCharArray();
        System.out.println(charArr);
    }
}
