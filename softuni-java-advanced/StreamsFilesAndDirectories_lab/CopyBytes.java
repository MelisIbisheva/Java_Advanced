package StreamsFilesAndDirectories_lab;

import java.io.*;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) {
        String path = "input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            PrintWriter writer = new PrintWriter(fileOutputStream);

            int read = fileInputStream.read();
            while (read!=-1){
                if(read==' '){
                    writer.print(' ');
                } else if (read==10) {
                    writer.println();
                }else {
                    writer.print(read);
                }
                read = fileInputStream.read();
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
