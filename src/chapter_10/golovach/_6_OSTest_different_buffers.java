package chapter_10.golovach;

import java.io.*;

public class _6_OSTest_different_buffers {
    public static void main(String[] args) throws IOException {
        String fileFromName = "Hrodno.jpg";
        String fileToName = "Hrodno1.jpg";

        for (int k = 1; k < 64 * 1024; k *= 2) {

            InputStream in = null;
            OutputStream out = null;
            try {
                in = new FileInputStream(fileFromName);
                out = new FileOutputStream(fileToName);
                long startTime = System.currentTimeMillis();
                copy(in, out, k);
                long stopTime = System.currentTimeMillis();
                System.out.println("Elapsed time = " + (stopTime - startTime));
            } catch (IOException e) {
                throw new IOException("Exception when copy from '"
                        + fileFromName + "'to file'" + fileToName + "'", e);
            } finally {
                closeQuietly(in);
                closeAndFlushQuietly(out);
            }
        }
    }

    private static void copy(InputStream in, OutputStream out, int bufferSize) throws IOException {
        byte[] buff = new byte[bufferSize];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
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

    private static void closeAndFlushQuietly(OutputStream out) {
        if (out != null) {
            try {
                out.flush();
            } catch (IOException ignore) {
                /*NOP*/
            }
            try {
                out.close();
            } catch (IOException ignore) {
                /*NOP*/
            }
        }
    }
}
