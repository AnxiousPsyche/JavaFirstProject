import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >=18){
            System.out.println("You are an a adult");
        } else if (age == 0) {
            System.out.println("You're just a baby!");
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet!");
        }

        else {
            System.out.println("You are a child");
        }


        input.close();
    }

}