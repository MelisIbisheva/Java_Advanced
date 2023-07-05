package FunctionalProframming_lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();
        Function<List<Integer>, Integer> sumAllElements = l-> l.stream().mapToInt(e->e).sum();
        Function<Integer, String> sumFormatter = s-> "Sum = "+ s;
        int sum = sumAllElements.apply(numberList);
        String printSum = sumFormatter.apply(sum);
        String count = countFormatter.apply(numberList);
        System.out.println(count);
        System.out.println(printSum);
    }
}
