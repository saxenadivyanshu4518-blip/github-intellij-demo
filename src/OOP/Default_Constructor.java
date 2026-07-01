package OOP;

 class students {

     int id ;
     int age ;

     // Java Parameterized Constructor

     students ( int id , int age) {

         this.id = id;
         this.age = age;
         System.out.println("Parameterized Constructor ");
     }

     // Java Default Constructor

      students (){
             System.out.println("Default Constructor");
         }
     }

public class Default_Constructor {
    static void main(String[] args) {

        students obj = new students();
        students obj1 = new students(5,18);
    }
}
