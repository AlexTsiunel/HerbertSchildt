package chapter_10.betacode.sequenceinputstrim;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SequenceInputStreamEx1 {
    private static String file_path1 = "C:\\Users\\Leshii82\\IdeaProjects\\HerbertSchildt\\src\\chapter_10\\betacode\\sequenceinputstrim\\flowers-1.txt";
    private static String file_path2 = "C:\\Users\\Leshii82\\IdeaProjects\\HerbertSchildt\\src\\chapter_10\\betacode\\sequenceinputstrim\\flowers-2.txt";

    public static void main(String[] args) throws IOException {
        InputStream is1 = new FileInputStream(file_path1);
        InputStream is2 = new FileInputStream(file_path2);

        InputStream is = new SequenceInputStream(is1, is2);

        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
