import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {


        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES

        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU

        while (isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank you! have a nice day!");
        System.out.println("***************************");
        input.close();


    }
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = input.nextDouble();

        if (amount < 0){
            System.out.println("***************");
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = input.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }
}