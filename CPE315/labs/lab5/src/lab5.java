import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class lab5 {
    public static void main(String[] args) {
        String[] lines = fileToString(args[0]).split("\n");
        Cache c0 = new Cache(1, 2048, 1, 1);
        Cache c1 = new Cache(2, 2048, 1, 2);
        Cache c2 = new Cache(3, 2048, 1, 4);
        Cache c3 = new Cache(4, 2048, 2, 1);
        Cache c4 = new Cache(5, 2048, 4, 1);
        Cache c5 = new Cache(6, 2048, 4, 4);
        Cache c6 = new Cache(7, 4096, 1, 1);
        for (int i = 0; i < lines.length; i++) {
            String addr = lines[i].split("\\s+")[1].trim();
            c0.lookup(addr, i);
            c1.lookup(addr, i);
            c2.lookup(addr, i);
            c3.lookup(addr, i);
            c4.lookup(addr, i);
            c5.lookup(addr, i);
            c6.lookup(addr, i);
        }
        c0.printResults();
        c1.printResults();
        c2.printResults();
        c3.printResults();
        c4.printResults();
        c5.printResults();
        c6.printResults();
    }

    public static String fileToString(String path) {
        // stolen from stack overflow
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return content;
    }
}