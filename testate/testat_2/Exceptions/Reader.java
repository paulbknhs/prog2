//TODO imports

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        FileReader reader;
        try {
            reader = new FileReader(args[0]);
            BufferedReader buf = new BufferedReader(reader);
            boolean EOF = false;
            while (!EOF) {
                String line = buf.readLine();
                if (line == null) {
                    EOF = true;
                    break;
                } else {
                    System.out.println(line);
                }
            }
            buf.close();
            reader.close();
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("No valid file");
            } else if (e instanceof IOException) {
                System.out.println("Reading error");
            }
        }
    }
}