package ch07;

public class Ex1 {
    public static void main(String[] args) {
        Student me = new Student("jochong", 23, 12211605);

        System.out.println(me);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Student extends Person {
        int studentNumber;

        Student(String name, int age, int studentNumber) {
            super(name, age);
            this.studentNumber = studentNumber;
        }

        @Override
        public String toString() {
            return '\n' +
                    "name: " + name + '\n' +
                    "age: " + age + '\n' +
                    "studentNum: " + studentNumber;
        }
    }
}
