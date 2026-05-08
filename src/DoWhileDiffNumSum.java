import java.util.Scanner;

public class DoWhileDiffNumSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int num = sc.nextByte();

        int sum = 0;
        do {
            sum += num;
            num = sc.nextInt();
        } while (num != -1);
        System.out.println(sum);
    }
}