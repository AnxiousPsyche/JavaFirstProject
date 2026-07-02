import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2)
        // volume = (4.0/3.0) * Math/PI * Math.pow(radius, 3)

        Scanner input = new Scanner(System.in);

        String name;
        char firstletter;
        int age;
        double height;
        boolean isEmployed;

        System.out.print("What is your name: ");
        name = input.nextLine();
        System.out.print("What is/are your initial/s: ");
        firstletter = input.next().charAt(0);
        System.out.print("How old are you?: ");
        age = input.nextInt();
        System.out.print("How tall are you (meters): ");
        height = input.nextDouble();
        System.out.print("Are you employed? (true/false): ");
        isEmployed = input.nextBoolean();

        System.out.printf("Hello %s%n Your initial is %c%n You are %d years old %n Your height is %.2f", name, firstletter, age, height);

        if (isEmployed){
            System.out.println(" and You're currently employed");
        }
        else {
            System.out.println(" and You're currently unemployed");
        }

    }
}
