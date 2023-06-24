package SetsAndMaps_exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,String> phonebook = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")){
            String[] data = input.split("-");
            String name = data[0];
            String phone = data[1];
            phonebook.put(name,phone);
            input = scanner.nextLine();
        }

        String inputName = scanner.nextLine();
        while (!inputName.equals("stop")){
            if(phonebook.containsKey(inputName)){
                System.out.printf("%s -> %s%n",inputName,phonebook.get(inputName) );
            }else {
                System.out.printf("Contact %s does not exist.%n", inputName);
            }

            inputName= scanner.nextLine();
        }
    }
}
