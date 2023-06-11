package stack_and_queues_lec;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Integer> openIndexes = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentSymbol = expression.charAt(i);
            if (currentSymbol == '(') {
                openIndexes.push(i);

            } else if (currentSymbol == ')') {
                int lastOpenIndex = openIndexes.pop();

                String matching = expression.substring(lastOpenIndex, i+1);
                System.out.println(matching);
            }

        }
    }
}
