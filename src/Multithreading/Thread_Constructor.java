package Multithreading;

class Mythr extends Thread {

    public Mythr(String name) {
        super(name);
    }

    @Override
    public void run() {

        int i = 1;

        while (i<34) {
            System.out.println(" I am a tread ");
            i++;
        }

    }
}
   public class Thread_Constructor {
       static void main(String[] args) {

           Mythr t = new Mythr("Harry");
           Mythr t1 = new Mythr("Ram Chandra");

           t.start();
           t1.start();

           // ID's of the Thread
           // Names of the Thread

           System.out.println(" Id of thread t is : " + t.getId());
           System.out.println(" Name of the Thread t is : " + t.getName());

           System.out.println(" Id of thread t is : " + t1.getId());
           System.out.println(" Name of the Thread t is : " + t1.getName());

       }
   }