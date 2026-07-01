package OOP.SuperKeyword;

class Animal__ {
    Animal__(){
        System.out.println(" Animal is Created ");
    }
}

class Dog__ extends  Animal__ {
     Dog__(){
         super();
         System.out.println(" Dog is created ");
     }
}
public class TestSuper3 {
    static void main(String[] args) {

        Dog__ obj = new Dog__();

    }
}
