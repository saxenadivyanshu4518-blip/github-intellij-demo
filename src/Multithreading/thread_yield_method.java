package Multithreading;

  class MyThread extends Thread {
     public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);

            // Current thread pauses to give Main thread a chance
            Thread.yield();

        }
    }
}

  public class thread_yield_method {
     public static void main(String[] args) {

        MyThread t = new MyThread();

        t.setName("Child-Thread");
        t.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);

        }
    }
}

