package ch06;

public class Ex6 {
    public static void main(String[] args) {
        Person personDefaultConstructor = new Person();
    }

    public static class Person {
        public String name;
        public int age;

        Person() {}

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public  String toString() {
            return "name: " + name + "   age: " + age;
        }
    }
}
