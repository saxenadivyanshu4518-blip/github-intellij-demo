package OOP.Abstraction;

 abstract class car {

     abstract public void fueltype ();

     public void color (){
         System.out.println("Black Color");
     }
 }

  class tata extends car {

      @Override
      public void fueltype() {
          System.out.println("Diesel");
      }
  }

public class Abtraction_Demo {
    static void main(String[] args) {

        tata nexon = new tata();
        nexon.fueltype();
        nexon.color();

    }
}
