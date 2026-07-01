package OOP.Inheritance;

class A {
    void methodA(){
        System.out.println("Method of A class");
    }
}

class B extends A {
    void methodB(){
        System.out.println("Method of B class");
    }
}

class C extends B {
    void methodC(){
        System.out.println("Method of C class");
    }
}

public class Multi_level_Inheritance {
    static void main(String[] args) {

        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();

    }
}
