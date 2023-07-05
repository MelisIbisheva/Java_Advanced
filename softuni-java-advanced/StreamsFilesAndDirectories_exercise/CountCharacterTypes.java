package StreamsFilesAndDirectories_exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacterTypes {
    public static void main(String[] args) {
        int vowels =0;
        int consonant = 0;
        int punctuation = 0;

        try(FileReader fr = new FileReader("input.txt")){
            int oneSymbol = fr.read();
            while (oneSymbol>=0){
                char symbolAsChar = (char) oneSymbol;
                if(isVowel(symbolAsChar)){
                    vowels++;

                } else if (isPunctuation(symbolAsChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar) && !Character.isDigit(symbolAsChar)) {
                    consonant++;

                    
                }

                oneSymbol = fr.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonant);
        System.out.println("Punctuation: " + punctuation);
    }
    public static boolean isVowel(char character){
        return  (character=='a'|| character =='o'|| character=='u' || character == 'e' || character=='i' );
    }
    public static boolean isPunctuation(char character){
        return  (character=='!'|| character ==','|| character=='.' || character == '?');
    }
}