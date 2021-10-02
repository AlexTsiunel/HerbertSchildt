package chapter_10.golovach;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class _0_ISTest {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream("TEST.txt");
        readFullyByByte(inFile);
        System.out.println("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();
        readFullyByByte(inUrl);
        System.out.println("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.println("\n\n\n");

    }
    public static void readFullyByByte (InputStream in) throws IOException {
        while (true){
            int oneByte = in.read();
            if(oneByte !=-1){
                System.out.print((char) oneByte);
            }else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
