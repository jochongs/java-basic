package ch09;

public class Ex1 {
    public static void main(String[] args) {
        String animalsWithComma = "cat,dog,zebra";

        String[] animals = animalsWithComma.split(",");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
