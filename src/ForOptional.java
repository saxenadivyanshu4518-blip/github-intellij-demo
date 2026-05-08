import java.util.Scanner;

public class ForOptional {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

       int num = n;
        for (; num >= 1;){
            System.out.println(num);
            num -= 2;
        }
    }
}
