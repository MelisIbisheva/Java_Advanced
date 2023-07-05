package StreamsFilesAndDirectories_exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) {
        Path input1 = Paths.get("inputOne.txt");
        Path input2 = Paths.get("inputTwo.txt");
        Path output = Paths.get("output.txt");

        try{
            List<String> firsFile = Files.readAllLines(input1);
            List<String> secondFile = Files.readAllLines(input2);
            Files.write(output, firsFile, StandardOpenOption.APPEND);
            Files.write(output, secondFile, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
