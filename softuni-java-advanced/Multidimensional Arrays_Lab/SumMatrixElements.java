package MultidimensionalArrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
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

        int sum = 0;
        for(int [] arr : matrix){
            for(int element : arr){
                sum+=element;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);


    }


}
