package StreamsFilesAndDirectories_exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))){

            String line = bufferedReader.readLine();
            long sum = 0;
            while (line!= null){

                char[] charactersFromLine = line.toCharArray();
                for (char singleCharacter : charactersFromLine) {
                    sum+=singleCharacter;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
