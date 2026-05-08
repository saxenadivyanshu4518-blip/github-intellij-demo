import java.util.Scanner;

public class NestedthreeAndFive {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a Number");
        int n = sc.nextInt();

        //Nested if-else

        if (n % 5 == 0) {
            if (n% 3 == 0){
                System.out.println(" The number is divisible by 3 & 5");
            }else{
                System.out.println(" Not divisible ");
            }
        }else{
            System.out.println(" Not divisible");
        }
    }
}