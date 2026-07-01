package OOP.Inheritance;

class vehicle {

    double price ;
    double mileage ;
    String color ;

    void display(){
        System.out.println("Price: "+price);
        System.out.println("Mileage: "+mileage);
        System.out.println("color: "+color);

    }
}

class car extends vehicle{

    String ftype ;
    boolean sunroof ;
    String brand ;

}
public class Inheritance_Second_Code {
    static void main(String[] args) {

        car obj = new car();

        obj.brand = "Tata";
        obj.price = 1500000;
        obj.mileage = 18.3;
        obj.ftype = "Diesel";
        obj.color = "Red";
        obj.sunroof = true;

        obj.display();
        System.out.println(obj.sunroof);
    }
}
