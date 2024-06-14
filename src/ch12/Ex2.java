package ch12;

public class Ex2 {
    static enum Kind { CLOVER, HEART, DIAMOND, SPADE }

    public static void main(String[] args) {
        System.out.println(Kind.valueOf("CLOVER"));
        System.out.println(Kind.CLOVER);
        System.out.println(Kind.HEART);
        System.out.println(Kind.DIAMOND);
        System.out.println(Kind.SPADE);
    }
}
