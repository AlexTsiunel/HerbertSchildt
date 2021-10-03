package chapter_10.golovach;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _5_OSTest_array {
    public static void main(String[] args) throws IOException {
        String fileName = "TEST.txt";

        InputStream inFile = null;


        try {
            inFile = new FileInputStream(fileName);
            byte[] data = readFullyByByte(inFile);
            System.out.println(new String(data, "UTF8"));
        } catch (IOException e) {
            throw new IOException("Exception when open and read file " + fileName, e);
        } finally {
            closeQuietly(inFile);
        }
    }

    private static byte[] readFullyByByte(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buff = new byte[5];
        int count;
        while ((count = in.read()) != -1) {
            out.write(buff, 0, count);
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
