package OOP.Polymorphism;

class Bank {

    void RateOfInterest(){
        System.out.println("Rate of Interest of Bank is 5 %");
    }
}

class SBI extends Bank {

    @Override
    void  RateOfInterest(){
        System.out.println("Rate of Interest of SBI is 6.5%");
    }
}

class PNB extends Bank {

    @Override
    void RateOfInterest(){
        System.out.println("Rate of Interest of PNB is 6%");
    }
}

public class Method_Overriding {
    static void main(String[] args) {

        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();

        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();

    }
}
