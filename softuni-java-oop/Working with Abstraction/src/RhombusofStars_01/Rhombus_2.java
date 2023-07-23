package RhombusofStars_01;

import java.util.Scanner;

public class Rhombus_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        printFirstHalf(size);
        printSecondHalf(size);

    }

    private static void printSecondHalf(int size) {
        for (int startCount = size - 1; startCount >0 ; startCount--) {
            printRow(size, startCount);
        }
    }

    private static void printFirstHalf(int size) {
        for (int startCount = 1; startCount <= size; startCount++) {
            printRow(size, startCount);
        }
    }

    private static void printRow(int size, int startCount) {
        for (int i = 0; i < size - startCount; i++) {
            System.out.print(" ");

        }
        for (int i = 0; i < startCount -1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
