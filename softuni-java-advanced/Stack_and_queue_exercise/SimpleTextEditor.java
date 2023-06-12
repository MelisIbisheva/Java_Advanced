package Stack_and_queues_exc;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stackCommands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandArguments = command.split(" ");
            String commandType = commandArguments[0];
            switch (commandType){
                case "1":
                    stackCommands.push(command);
                    executeAdd(commandArguments[1], text);
                    break;
                case "2":
                    stackCommands.push(command);
                    int countToDelete = Integer.parseInt(commandArguments[1]);
                    executeDelete(countToDelete,text);
                    break;
                case "3":
                    int index = Integer.parseInt(commandArguments[1]);
                    System.out.printf("%s%n", text.charAt(index-1));
                    break;
                case "4":
                    String lastCommand = stackCommands.pop();
                    String[] lastCommandArguments = lastCommand.split(" ");
                    String lastCommandType = lastCommandArguments[0];
                    switch (lastCommandType){
                        case "1":
                            int elementsToDelete = lastCommandArguments[1].length();
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int j = text.length()-elementsToDelete; j < text.length() ; j++) {
                                stringBuilder.append(text.charAt(i));

                            }
                            removedElements.push(stringBuilder.toString());

                            executeDelete(elementsToDelete, text);
                            break;
                        case "2":
                            String elementsToAddBack = removedElements.pop();
                            executeAdd(elementsToAddBack, text);

                            break;
                    }
                    break;

            }

        }
    }

    private static void executeDelete(int countToDelete, StringBuilder text) {
        for (int i = 0; i <countToDelete ; i++) {
            text.deleteCharAt(text.length()-1);

        }
    }

    private static void executeAdd(String commandArgument, StringBuilder text) {
        text.append(commandArgument);
    }
}
