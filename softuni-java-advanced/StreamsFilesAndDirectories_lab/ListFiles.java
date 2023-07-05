package StreamsFilesAndDirectories_lab;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) {
        File root = new File("D:\\advanced\\softuni-advanced\\" +
                "04.Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        Arrays.stream(root.listFiles())
                .filter(File::isFile)
                .forEach(f-> System.out.println(f.getName() + ": " + '[' + f.length() + ']'));
    }
}
