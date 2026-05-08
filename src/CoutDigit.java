import java.util.Scanner;

public class CoutDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numberofdigits = 0;
        int original_n = n;

        while (n>0){
            n = n / 10 ;
            numberofdigits++;
        }
        System.out.println(" Numer of digit in " + original_n + " = " + numberofdigits );
    }
}
