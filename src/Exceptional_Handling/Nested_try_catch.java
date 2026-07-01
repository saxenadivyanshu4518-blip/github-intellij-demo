package Exceptional_Handling;

public class Nested_try_catch {
    static void main(String[] args) {

        int arr [] = new int [5];

        try {
            System.out.println("I am in first try block");
            try {
                arr [6] = 10;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
