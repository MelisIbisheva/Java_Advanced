package MultidimensionalArrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {


            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = arr;
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(row==col){
                    System.out.print(matrix[row][col] + " ");
                }

            }

        }
        System.out.println();

//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if(row==n-1-col){
//                    System.out.print(matrix[row][col] + " ");
//                }
//
//            }
//
//        }
        int row = n-1;
        int col = 0;
        while (row>= 0 && row <n && col>=0 && col< n){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }

    }
}
