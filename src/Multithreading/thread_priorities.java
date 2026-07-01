package Multithreading;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }

    @Override
    public void run() {

        // int i = 34 ;

        while(true){

            System.out.println("Thank you" + this.getName());
        }
    }
}

public class thread_priorities {
    static void main(String[] args) {

        // Ready Queue : T1 T2 T3 T4 T5

        Mythr1 t1 = new Mythr1("Harry1");
        Mythr1 t2 = new Mythr1("Harry2");
        Mythr1 t3 = new Mythr1("Harry3");
        Mythr1 t4 = new Mythr1("Harry4");
        Mythr1 t5 = new Mythr1("Harry5 " + "(Most Important Thread)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
