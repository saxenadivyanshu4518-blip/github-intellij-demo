package Exceptional_Handling;

public class Finally {
    public static void divide (int dividend , int divisor){
        System.out.println("\n--- calculating : " + dividend + "/" + divisor + " ---");

        try {
            System.out.println("inside the try block");
            int result = dividend / divisor;
            System.out.println("Result calculated : " + result);
        }catch (ArithmeticException e){
            System.out.println("Inside the catch block. Exception : " + e.getMessage());
        }
        finally {
            System.out.println("Inside the finally block. (Always executes!)");
        }
            System.out.println("Code Outside the try-catch-finally Structure");
    }
    static void main(String[] args) {

        divide(10,2);
       // divide(10,0);
    }
}
