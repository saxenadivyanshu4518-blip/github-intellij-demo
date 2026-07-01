package Multithreading;

class Mythr1_ extends Thread{
    @Override
    public void run() {

         int i = 0 ;

        while(i<20){

            System.out.println("Thank you : ");
            i++;
        }
    }
}

class MyNewthr extends Thread {
    @Override
    public void run() {

        int i = 0 ;

        while(i<500){

            System.out.println("Hello world : ");
           i++;
        }
    }
}

public class thread_methods {
   public static void main() {

       Mythr1_ t1 = new Mythr1_();
       MyNewthr t2 = new MyNewthr();

       t1.start();

       try {
           t1.join();
       }
       catch (Exception e){
           System.out.println(e);
       }

       t2.start();

    }
}
