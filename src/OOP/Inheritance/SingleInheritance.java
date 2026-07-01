package OOP.Inheritance;

class employee {

    void salary (){
        System.out.println("Single = 70000");
    }
}

class hr extends employee{

    void bonus (){
        System.out.println("Bonus = 20000");
    }
}

public class SingleInheritance {
    static void main(String[] args) {

        hr obj = new hr();
        obj.salary();
        obj.bonus();
    }
}
