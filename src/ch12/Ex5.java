package ch12;

public class Ex5 {
    static class Person {
        public final String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        @Deprecated
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        Person jochong = new Person("jochong");
        jochong.toString(); // deprecated but you can use
    }
}
