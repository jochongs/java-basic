package ch12;

public class Ex1 {
    static class Box<T> {
        T contents;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        Box box = (Box) (intBox);

        Box<Object> objBox = new Box<>();
        //intBox = (Box<Integer>) objBox; -> Generic type 끼리 형 변환은 가능하지 않음
    }
}
