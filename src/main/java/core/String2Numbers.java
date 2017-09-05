package core;

import java.util.Arrays;
import java.util.Scanner;

public class String2Numbers {

    public static void main(String[] args) {

        System.out.print("Type a number: ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine(); input.close();
        System.out.print("Entered number is: ");

        // Start coding
        final String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

        String [] numbers = number.split(" ");

        for (int i = 0; i < numbers.length; i ++){
            System.out.print(Arrays.asList(units).indexOf(numbers[i]));
        }
        // End coding
    }
}
