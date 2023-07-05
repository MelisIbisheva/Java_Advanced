package StreamsFilesAndDirectories_exercise;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))){
            br.lines().forEach(line -> pw.println(line.toUpperCase()));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
