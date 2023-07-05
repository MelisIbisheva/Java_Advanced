package StreamsFilesAndDirectories_lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            Set<Character> punctuations = Set.of(',','.','!','?');

            int read = fileInputStream.read();
            while (read!=-1){
                if(!punctuations.contains((char)read)){
                    fileOutputStream.write(read);
                }

                read = fileInputStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
