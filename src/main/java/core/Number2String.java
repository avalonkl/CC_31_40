package core;

import java.util.Scanner;

public class Number2String {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        input.close();
        System.out.print("Entered number is: ");

        // Start coding
        System.out.print(convert(number));
    }


    public static String convert(long number) {

        final String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 20) {
            return units[(int) number];
        }
        if (number < 100) {
            return tens[(int) number / 10] + ((number % 10 > 0) ? " " + convert(number % 10) : "");
        }
        if (number < 1_000) {
            return units[(int) number / 100] + " hundreds " + ((number % 100 > 0) ? "and "
                    + convert(number % 100) : "");
        }
        if (number < 1_000_000) {
            return convert(number / 1_000) + " thousands " + ((number % 1_000 > 0) ? ""
                    + convert(number % 1_000) : "");
        }
        if (number < 1_000_000_000) {
            return convert(number / 1_000_000) + " millions " + ((number % 1_000_000 > 0) ? ""
                    + convert(number % 1_000_000) : "");
        }
        if (number < 1_000_000_000_000L) {
            return convert(number / 1_000_000_000) + " billions " + ((number % 1_000_000_000 > 0) ? ""
                    + convert(number % 1_000_000_000) : "");
        }
        if (number < 1_000_000_000_000_000L) {
            return convert(number / 1_000_000_000_000L) + " trillions " + ((number % 1_000_000_000_000L > 0) ? ""
                    + convert(number % 1_000_000_000_000L) : "");
        } else {
            return convert(number / 1_000_000_000_000_000L) + " quadrillions " + ((number % 1_000_000_000_000_000L > 0) ? ""
                    + convert(number % 1_000_000_000_000_000L) : "");
        }
    }
}
        // End coding

