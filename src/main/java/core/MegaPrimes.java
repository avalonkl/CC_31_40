package core;

import java.util.Scanner;

public class MegaPrimes {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("MegaPrimes are: ");
        // Start coding
        for (int i = 10; i <= number; i ++) {
            boolean flag = true;
            if (isPrime(i)) {
                int digits = i;
                while (digits > 0 && flag) {
                    if (isPrime(digits % 10)) {
                        digits /= 10;
                    }
                    else {
                        flag = false;
                    }

                }
            }
            else flag = false;
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // End coding
}
