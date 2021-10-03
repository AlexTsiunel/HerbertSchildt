package chapter_10.golovach;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _4_OSTest {
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

    private static byte[] readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((oneByte = in.read()) !=-1) {
            out.write(oneByte);
        }
        return out.toByteArray();
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
