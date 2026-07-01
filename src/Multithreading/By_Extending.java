
package Multithreading;

 class Mytread1 extends Thread {

     @Override
     public void run() {

         int i = 0 ;

         while (i<40000){
             System.out.println(" My cooking thread is Running ");
             System.out.println(" I am Happy ! ");
             i++;

         }
     }
 }

 class Mythread2 extends Thread{

     @Override
     public void run() {

        int i = 0 ;

        while (i<40000){
            System.out.println(" Thread 2 for chatting with her ");
            System.out.println(" I am sad ! ");
            i++;

        }
     }
 }

public class By_Extending {
    static void main(String[] args) {

        Mytread1 t1 = new Mytread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();

    }
}
