import java.util.Scanner;

public class Main {
    public static void  main(String [] args) {

        Scanner input = new Scanner(System.in);

        int hours = 8;

        String timeofDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeofDay);
    }
}