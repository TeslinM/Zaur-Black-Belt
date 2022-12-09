package lesson38;

import java.io.*;

public class CopyEx1 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("twst3.txt"));
            ) {
//            int character;
//            while ((character=reader.read()) !=-1) {
//                writer.write(character);
//            }

            String line;
            while((line=reader.readLine()) != null) {
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
