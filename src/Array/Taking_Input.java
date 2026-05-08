package Array;

import java.util.Scanner;

public class Taking_Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input

        System.out.print(" Enter array size : ");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.print(" Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print Output

        for (int  i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

