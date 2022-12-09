package lesson38;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterex1 {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет я размышлял над жизнью земной. Непонятного нет для меня под луной.";
        String s = " Privet";

        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt", true);
//            for(int i = 0; i<rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            writer.write((rubai));
//            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer.close();
        }
    }
}
