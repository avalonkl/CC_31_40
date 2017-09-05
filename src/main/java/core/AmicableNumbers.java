package core;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class AmicableNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.println("Amicable numbers are: ");

        // Start coding
        for (int i = 1; i <= number; i ++){
            int sum = sumOfDivisors(i);
            if (i == sumOfDivisors(sum) && i > sum) {
                System.out.println(i + " " + sum);
            }
        }
    }

    public static int sumOfDivisors (int number){
        int sum = 0;
        for (int i = number - 1; i > 0;i --){
            if (number % i == 0){
                sum += i;
            }
        }
        return (sum);
    }
    // End coding
}
