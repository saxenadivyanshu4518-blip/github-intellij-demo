package OOP.Inheritance;

// interface in Java to achieve multiple inheritance

interface  Divyanshu {
    public void run ();
}

interface Saxena {
    public void run ();
}

class Normal implements Divyanshu , Saxena {
    public void run (){
        System.out.println(" C class run method ");
    }
}

public class Multiple_Inheritance {
    static void main(String[] args) {

        Normal obj = new Normal();
        obj.run();
    }
}
