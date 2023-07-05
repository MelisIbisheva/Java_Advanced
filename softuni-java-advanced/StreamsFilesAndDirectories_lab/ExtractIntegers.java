package StreamsFilesAndDirectories_lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(fileInputStream);

        PrintWriter writer = new PrintWriter(new FileOutputStream("integer-out.txt"));
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                writer.println(scanner.next());
            }else {
                scanner.next();
            }

        }
        writer.close();

    }
}
