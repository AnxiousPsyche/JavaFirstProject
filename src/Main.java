import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM


        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = input.nextInt();

        if (numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled:" + roll);
                total += roll;
            }
            System.out.println("total: " + total);

        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        // GET THE TOTAL

        //DISPLAY ASCII OF DICE

        input.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        System.out.println(dice1);
    }
}