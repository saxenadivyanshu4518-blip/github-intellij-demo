package Exceptional_Handling;

public class Multiple_Exception {
    static void main(String[] args) {

        int arr [] = new int [5];

        try {
            arr [6] = 10 ;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            arr [4] = 10 /0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
