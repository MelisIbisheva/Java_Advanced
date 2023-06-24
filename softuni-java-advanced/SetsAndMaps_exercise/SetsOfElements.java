package SetsAndMaps_exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] setSizes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = setSizes[0];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
            String input = scanner.nextLine();
            firstSet.add(input);

        }

        int secondSetSize = setSizes[1];

        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < secondSetSize; i++) {
            String input = scanner.nextLine();
            secondSet.add(input);
        }
        for(String element : firstSet){
            if(secondSet.contains(element)){
                System.out.print(element + " ");

            }
        }



    }
}
