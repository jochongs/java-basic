package ch13;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        nonBlocking();
    }

    static void blocking() {
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {}
        }
    }

    static void nonBlocking() {
        Runnable task = new MyTask();
        Thread thread = new Thread(task);

        thread.start();
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(300);
                } catch (Exception e) {}
            }
        }
    }
}
