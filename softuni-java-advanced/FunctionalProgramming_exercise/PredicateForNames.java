package FunctionalProgramming_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nameLength = Integer.parseInt(scanner.nextLine());
        List<String> stringsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Predicate<String> filterByLength = name-> name.length()<=nameLength;

        stringsList.stream().filter(filterByLength)
                .forEach(System.out::println);
    }
}
