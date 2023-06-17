package MultidimensionalArrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int [][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;

        }

        int maxSum = Integer.MIN_VALUE;
        int[][] result = new int[2][2];

        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols-1; col++) {
                int currSum = matrix[row][col]
                        +matrix[row][col+1]
                        +matrix[row+1][col]
                        +matrix[row+1][col+1];

                if(maxSum<currSum){
                    maxSum=currSum;
                    result = new int[][]{
                            {matrix[row][col],matrix[row][col+1]},
                            {matrix[row+1][col],matrix[row+1][col+1]}
                    };
                }

            }

        }
        for(int[] arr : result){
            for(int e: arr ){
                System.out.print(e + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}
