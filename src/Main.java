import java.util.Scanner;

public class Main {
    public static void  main(String [] args) {

       Scanner input = new Scanner(System.in);

       int number = 0;

        do {
            System.out.println("Enter a number between 1 -10: ");
            number = input.nextInt();
        }while (number <1 || number > 10);

        System.out.println("You picked " + number);



        input.close();
    }
}