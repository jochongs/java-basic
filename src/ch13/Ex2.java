package ch13;

public class Ex2 {
    public static void main(String[] args) {
        MyTask task1 = new MyTask("-");
        MyTask task2 = new MyTask("|");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

    static class MyTask implements Runnable {
        private final String letter;

        MyTask(String letter) {
            this.letter = letter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.print(letter);
            }
        }
    }
}
