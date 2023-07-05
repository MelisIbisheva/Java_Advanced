package StreamsFilesAndDirectories_lab;
import java.io.*;

public class SerializeCustomObject {
    public static class Cube implements Serializable{
        String color;
        Double width;
        Double height;
        double depth;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube iceCube = new Cube();
        iceCube.color = "water";
        iceCube.width = 13.0;
        iceCube.height = 42.0;
        iceCube.depth = 69.0;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ice-cube.txt"));
        objectOutputStream.writeObject(iceCube);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ice-cube.txt"));

        Cube cube = (Cube) objectInputStream.readObject();



    }

}
