package Exceptional_Handling;

public class Throws_Demo {

    public static void divide (int dividend , int divisor ) throws ArithmeticException {
        System.out.println("The result is : " + dividend / divisor );
    }
    public static void main(String[] args) {

      divide(10,0);
    }
}
