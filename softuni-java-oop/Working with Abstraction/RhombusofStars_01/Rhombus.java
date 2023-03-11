package RhombusofStars_01;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        for (int startCount = 1; startCount <= size; startCount++) {
            for (int i = 0; i <size-startCount ; i++) {
                System.out.print(" ");

            }
            for (int i = 0; i < startCount-1; i++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        for (int startCount = size - 1; startCount >0 ; startCount--) {
            for (int i = 0; i <size-startCount ; i++) {
                System.out.print(" ");

            }
            for (int i = 0; i < startCount-1; i++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

    }
}
