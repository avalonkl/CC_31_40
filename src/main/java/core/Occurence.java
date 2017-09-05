package core;

import java.util.Scanner;

public class Occurence  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt();
        System.out.print("Enter number to search: ");
        int search = input.nextInt(); input.close();
        System.out.print("Number of occurence: ");

        // Start coding

        int count = 0;
        while (number > 0){
            if (search == number % 10){
                count ++;
            }
            number /= 10;
        }
        System.out.print(count);

        // End coding
    }
}
