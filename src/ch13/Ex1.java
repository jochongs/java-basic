package ch13;

public class Ex1 {
    // Thread 클래스 상속
    class MyThread extends Thread {}

    /// Runnable 인터페이스를 구현
    class MyThread2 implements Runnable {
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        Runnable r = new Thread();

        Thread thread = new Thread(r);

        System.out.println(thread.getName());
    }
}
