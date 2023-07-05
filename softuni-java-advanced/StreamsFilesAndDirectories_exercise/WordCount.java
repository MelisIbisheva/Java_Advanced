package StreamsFilesAndDirectories_exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(new FileReader("words.txt"));
        Scanner textScanner = new Scanner(new FileReader("text.txt"));
            PrintWriter printWriter = new PrintWriter("results.txt")){
            LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
            String wordLine = sc.nextLine();
            Arrays.stream(wordLine.split(" ")).forEach(word->wordsMap.put(word, 0));


            while (textScanner.hasNext()){
                String textInput = textScanner.next();
                if(wordsMap.containsKey(textInput)){
                    int count = wordsMap.get(textInput);
                    count++;
                    wordsMap.put(textInput, count);

                }

            }
            wordsMap.entrySet().forEach(entry->printWriter.printf("%s - %d%n", entry.getKey(), entry.getValue()));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
