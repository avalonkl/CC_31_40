package core;

import java.util.Scanner;

public class Seconds {

    public static void main(String[] args) {

        System.out.print("Enter a number of seconds: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();

        // Start coding
        int hours = number / 3600;
        number %= 3600;

        int minutes = number / 60;
        int seconds = number % 60;
        // End coding

        System.out.print(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
