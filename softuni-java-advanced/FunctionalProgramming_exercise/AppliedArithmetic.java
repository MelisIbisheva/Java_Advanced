package FunctionalProgramming_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = numbersList->numbersList.stream().map(e->e+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = numbersList->numbersList.stream().map(e->e-1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = numbersList->numbersList.stream().map(e->e*2).collect(Collectors.toList());
        Consumer<Integer> print = number-> System.out.print(number + " ");

        String input = scanner.nextLine();

        while (!input.equals("end")){
            switch (input){
                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(print);
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
