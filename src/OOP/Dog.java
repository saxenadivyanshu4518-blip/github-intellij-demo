package OOP;

public class Dog {

    int License_id ;
    String name ;

    // Java method

    public void eat (){

        System.out.println(name + "eats");

    }

    static void main(String[] args) {

        Dog mydog = new Dog();
        mydog.name = "Bruno ";
        mydog.eat();
    }
}
