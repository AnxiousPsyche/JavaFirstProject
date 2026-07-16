import java.util.Scanner;

public class Main {
    public static void  main(String [] args) {

       Scanner input = new Scanner(System.in);

       int age = 0;

        do{
           if (age <=0){
               System.out.println("Age must be greater than 0.");
           } else if (age <=13){
               System.out.println("You must be above 13 years old to enter");
           }
            System.out.print("Enter your age: ");
            age = input.nextInt();
       }while (age <=13);

       System.out.println("Welcome");



        input.close();
    }
}