package core;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt(); input.close();

        System.out.print("GCD is: ");

        // Start coding
         System.out.print(gcd(a, b));
    }

    public static int gcd (int first, int second){
        if (second == 0){
            return first;
        }
        else {
            return gcd(second, first % second);
        }
    }
    // End coding
}
