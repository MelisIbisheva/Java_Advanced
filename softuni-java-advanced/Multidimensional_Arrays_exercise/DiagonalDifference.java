package MultidimensionalArrays_exc;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        int firstSum = 0;


        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row ==col){
                    firstSum+=matrix[row][col];
                }

            }

        }
        int secondSum = 0;
        for (int row = 0, col = size-1; row <size; row++, col--) {
            secondSum+=matrix[row][col];
            
        }

        int difference = Math.abs(firstSum-secondSum);
        System.out.println(difference);

        
    }
}
