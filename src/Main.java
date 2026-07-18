import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Leah";
        int age = 25;

        happyBirthday (name, age);

    }
    static void happyBirthday (String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old! \n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}