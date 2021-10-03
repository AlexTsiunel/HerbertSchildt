package chapter_10.golovach;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _3_ISTest_array_short {
    public static void main(String[] args) throws IOException {
        String fileName = "TEST.txt";

        InputStream inFile = null;


        try {
            inFile = new FileInputStream(fileName);
            readFullyByByte(inFile);
        } catch (IOException e) {
            throw new IOException("Exception when open and read file " + fileName, e);
        } finally {
            closeQuietly(inFile);
        }
    }

    private static void readFullyByByte(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        int count;
        while ((count = in.read(buff)) !=-1) {
            System.out.print(new String(buff, 0, count, "UTF8"));
        }
        System.out.println();
    }

    public static void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {
                /*NOP*/
            }
        }
    }
}
