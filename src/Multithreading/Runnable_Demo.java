
package Multithreading;

class MythreadRunnable1 implements Runnable {

    @Override
    public void run() {

        int i = 0;

     while (i<40000){

         System.out.println(" I am Thread 1 not a threat 1 ");
         i++;

      }
    }
}

class MythreadRunnable2 implements Runnable {

    @Override
    public void run() {

        int i = 0;

        while (i<40000){

            System.out.println(" I am Thread 2 not a threat 2 ");
            i++;

        }
    }
}

public class Runnable_Demo {
    static void main(String[] args) {

        MythreadRunnable1 Bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(Bullet1);

        MythreadRunnable2 Bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(Bullet2);

        gun1.start();
        gun2.start();

    }
}
