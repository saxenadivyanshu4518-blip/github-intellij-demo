package Exceptional_Handling;

public class Combined_Both {
    static void main(String[] args) {

        int arr [] = new int [5];

        try {
            arr [6] = 10 ;
           // arr [4] = 10 / 0 ;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
