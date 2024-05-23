package ch06;

public class Ex7 {
    public static void main(String[] args) {
        Person person1 = new Person("jochong", 23);
        Person person2 = new Person(32);

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person() {
            this("Anonymous", 20);
        }

        Person(String name) {
            this(name, 0);
        }

        Person(int age) {
            this("Anonymous", age);
        }

        @Override
        public String toString() {
            return "\nname: " + name + "\n" + "age: " + age;
        }
    }
}
