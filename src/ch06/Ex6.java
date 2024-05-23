package ch06;

public class Ex6 {
    public static void main(String[] args) {
        Person personDefaultConstructor = new Person();

        Person personNotDefaultConstructor = new Person("jochongs", 23);

        System.out.println("personDefaultConstructor = " + personDefaultConstructor);
        System.out.println("personNotDefaultConstructor = " + personNotDefaultConstructor);
    }

    public static class Person {
        public String name;
        public int age;
        char a;
        boolean testBool;

        Person() {}

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public  String toString() {
            return "name: " + name + "   age: " + age + "      bool:" + testBool + "      char: " + a;
        }
    }
}
