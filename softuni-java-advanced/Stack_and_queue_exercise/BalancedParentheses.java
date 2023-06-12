package Stack_and_queues_exc;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int i = 0; i < brackets.length(); i++) {
            char currentBrackets = brackets.charAt(i);
            if(currentBrackets =='(' || currentBrackets=='{'|| currentBrackets=='['){
                openingBrackets.push(currentBrackets);
            }else {
                if(openingBrackets.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastOpeningBrackets = openingBrackets.pop();
                if(currentBrackets =='}' && lastOpeningBrackets !='{' ){
                    isBalanced = false;
                } else if (currentBrackets==')' && lastOpeningBrackets!='(') {
                    isBalanced = false;

                } else if (currentBrackets==']' && lastOpeningBrackets !='[') {
                    isBalanced = false;
                }
            }

        }
        if(isBalanced){
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }

    }
}
