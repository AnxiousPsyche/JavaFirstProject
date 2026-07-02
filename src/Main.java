import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item do you want to buy: ");
        item= input.nextLine();

        System.out.print("What is the price for each?: ");
        price = input.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = input.nextInt();

        total = price * quantity;

        System.out.print("You have bought " + quantity + " " + item + "/s ");
        System.out.print("\nYour total is " + currency + total);


        input.close();
    }
}