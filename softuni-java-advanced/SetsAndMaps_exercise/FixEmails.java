package SetsAndMaps_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        LinkedHashMap<String,String> emailsMap = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if(!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")){
                emailsMap.put(name, email);

            }

            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emailsMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }
}
