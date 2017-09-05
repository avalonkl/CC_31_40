package core;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.print("Enter a number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(); input.close();
        System.out.println("Pascal Triangle: ");

        // Start coding

        for (int i = 0; i < rows; i ++){
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j ++){
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        // End coding
    }
}
