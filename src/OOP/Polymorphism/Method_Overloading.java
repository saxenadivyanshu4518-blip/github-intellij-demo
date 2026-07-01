package OOP.Polymorphism;

class Overloading_Demo{

    void sum (int a , int b ){
        System.out.println(a+b);
    }

    void sum (int a , int b , int c ){
        System.out.println(a+b+c);
    }
    void sum (String a , String b){
        System.out.println(a+b);
    }
}

public class Method_Overloading {
    static void main(String[] args) {
        Overloading_Demo obj = new Overloading_Demo();

        obj.sum(5,6);
        obj.sum(5,6,8);
        obj.sum("Indian " , "Programmer");
    }

}
