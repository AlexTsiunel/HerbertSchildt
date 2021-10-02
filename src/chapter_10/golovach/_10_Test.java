package chapter_10.golovach;

import java.io.*;
import java.util.Arrays;

public class _10_Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        InputStream in = new FileInputStream("TEST.txt");
        readFullyByByte(in);
        closeQuietly(in);
    }

    private static void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {
                /*....*/
            }
        }
    }

    private static void readFullyByByte(InputStream in) throws UnsupportedEncodingException {
        byte[] buff = new byte[5];
        int count = 0;
        while (true) {
            try {
                count = in.read(buff);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (count != -1) {
                System.out.println("count = " + count
                        + ", buff = " + Arrays.toString(buff)
                        + ", str = " + new String(buff, 0, count, "UTF8"));
            } else {
                break;
            }
        }
    }

}
