package core;

import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int result[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix # 1 [" + i + "][" + j + "]:");
                matrix1[i][j] = scan.nextInt();}}
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix # 2 [" + i + "][" + j + "]:");
                matrix2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        // Start coding
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                for (int n = 0; n < 3; n ++){
                    result[i][j] = result[i][j] + matrix1[i][n] * matrix2[n][j];
                }
            }
        }
        // End coding
        System.out.println("Matrix Multiplication: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
