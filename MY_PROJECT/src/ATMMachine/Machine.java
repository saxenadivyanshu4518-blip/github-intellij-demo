package ATMMachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {

        System.out.print("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN)
            menu();
        else
            System.out.println("Enter a valid PIN");
    }


    public void menu() {

        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withraw Money: ");
        System.out.println("3. Deposite Money: ");
        System.out.println("4. Exit: ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {

        System.out.println("Balance: " + Balance);
        menu();

    }

    public void withdrawMoney() {

        System.out.print("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        float amout = sc.nextInt();
        if (amout > Balance) {
            System.out.println("Insuficient Balance");
        } else {
            Balance = Balance - amout;
            System.out.println("Money withdrawled Successfully");

        }

        menu();
    }


    public void depositeMoney() {

        System.out.print("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amout = sc.nextInt();
        Balance = Balance + amout;
        System.out.println("Money deposited Successfully");
        menu();

    }

}


public class Machine {
    static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();

    }
}
