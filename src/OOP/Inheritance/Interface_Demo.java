package OOP.Inheritance;

interface Car {
    public void starts ();
}

class Electic_Car implements Car{
    @Override
    public void starts() {
        System.out.println("Electric Car Starts");
    }
}

class Diesel_Car implements Car {
    @Override
    public void starts() {
        System.out.println("Diesel Car Starts");
    }
}

public class Interface_Demo {
    static void main(String[] args) {

        Car Tesla = new Electic_Car();
        Car XUV700 = new Diesel_Car();

        Tesla.starts();
        XUV700.starts();
        
    }
}

