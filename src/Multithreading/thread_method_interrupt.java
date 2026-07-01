package Multithreading;

class SleepingTask extends Thread {
    public void run() {
        try {
            Thread.sleep(1000); // Throws InterruptedException if interrupted here
            System.out.println(" Thread is running... ");
        } catch (InterruptedException e) {
            System.out.println(" Thread interrupted " + e);
        }
    }
}

public class thread_method_interrupt {
    public static void main(String[] args) {

        SleepingTask thread = new SleepingTask();
        thread.start();

        thread.interrupt();

    }
}
