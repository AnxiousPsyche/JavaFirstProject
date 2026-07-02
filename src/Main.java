import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Are you a student(true/false): ");
        isStudent = input.nextBoolean();

        //Group 1
        if (name.isEmpty()){
            System.out.println("Who are you? why didn't you enter your name?");
        }
        else {
            System.out.println("Hello " + name + "!");
        }



        // Group 2

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

        //Group 3

        if (isStudent) {
            System.out.println("You are enrolled in my class😡");
        }
        else {
            System.out.println("You are not enrolled in my class!👌");
        }


        input.close();
    }

}