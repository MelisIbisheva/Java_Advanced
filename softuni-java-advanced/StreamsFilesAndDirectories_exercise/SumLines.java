package StreamsFilesAndDirectories_exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {
         try(BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))){

             String line = bufferedReader.readLine();
             while (line!= null){
                 long sum = 0;
                 char[] charactersFromLine = line.toCharArray();
                 for (char singleCharacter : charactersFromLine) {
                     sum+=singleCharacter;
                 }
                 System.out.println(sum);
                 line = bufferedReader.readLine();
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
