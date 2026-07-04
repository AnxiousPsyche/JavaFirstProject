import java.util.Scanner;

public class Main {
    public static void  main(String [] args) {

        Scanner input = new Scanner(System.in);

        // Decalare variables
        double weight ;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Weight Convertion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = input.nextInt();

        if (choice== 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: " + newWeight);
        }
        else {
            System.out.print("Enter the weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The new weight in lbs is: " + newWeight);
        }


        input.close();
    }
}