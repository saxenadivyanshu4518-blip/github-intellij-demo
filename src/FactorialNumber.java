import java.util.Scanner;

public class FactorialNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(" Factrorial of " + n +" : " + fact);
    }
}
