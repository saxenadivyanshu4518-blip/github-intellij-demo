package OOP;

class  Students {

    int id ;
    int age ;

    // Java Constructor
    Students ( int id , int age){

        this.id = id;
        this.age = age;

        System.out.println("Hello Dosto");
    }
}

public class Constructor {
    static void main(String[] args) {

        Students obj = new Students(5,18);
    }
}