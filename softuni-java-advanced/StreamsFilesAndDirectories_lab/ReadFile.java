package StreamsFilesAndDirectories_lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int read = fileInputStream.read();
            while (read!=-1){
                System.out.print(Integer.toBinaryString(read) + " ");
                read = fileInputStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
