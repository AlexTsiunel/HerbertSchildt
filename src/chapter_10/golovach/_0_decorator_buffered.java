package chapter_10.golovach;

import java.io.*;

public class _0_decorator_buffered {
    public static void main(String[] args) throws IOException {
        String fileFromName = "Hrodno.jpg";
        String fileToName = "Hrodno1.jpg";

        for (int k = 1; k < 64 * 1024; k *= 2) {

            InputStream in = null;
            OutputStream out = null;
            try {
                in = new BufferedInputStream(
                        new FileInputStream(fileFromName), k);

                out = new BufferedOutputStream(
                        new FileOutputStream(fileToName), k);
                long startTime = System.currentTimeMillis();
                copy0(in, out);
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

    private static void copy0(InputStream in, OutputStream out) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            out.write(oneByte);
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
