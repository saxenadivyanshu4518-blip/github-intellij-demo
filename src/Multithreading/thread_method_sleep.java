package Multithreading;

class Threa_d extends Thread{

    @Override
    public void run (){
        for (int i = 1 ; i <= 5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class thread_method_sleep {
    static void main() {

        Threa_d t1 = new Threa_d();

        t1.start();

    }
}
