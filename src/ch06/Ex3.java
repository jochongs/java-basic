package ch06;

public class Ex3 {
    public static void main(String[] args) {
        Person me = Person.createEntity("jochong", 23);

        System.out.println("me = " + me);
    }

    static private class Person {
        private final String name;
        private final int age;

        private Person(String name, int age) {
            this.name = name;
            this. age = age;
        }

        public String name() {
            return name;
        }

        public int age() {
            return age;
        }

        static Person createEntity(String name, int age) {
            return new Person(name, age);
        }

        @Override
        public String toString() {
            return "name: " + name + " age: " + age;
        }
    }
}
