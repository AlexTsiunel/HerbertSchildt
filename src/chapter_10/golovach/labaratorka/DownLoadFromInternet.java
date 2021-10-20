package chapter_10.golovach.labaratorka;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DownLoadFromInternet {
    public static void main(String[] args) {

        File file0 = new File("src/chapter_10/golovach/labaratorka/tmp0.html");
        File file1 = new File("src/chapter_10/golovach/labaratorka/tmp1.html");
        BufferedInputStream bis = null;
        BufferedOutputStream bos0 = null;
        BufferedOutputStream bos1 = null;

        try {
            bis = new BufferedInputStream(new URL("https://www.google.by/").openStream());
            bos0 = new BufferedOutputStream(new FileOutputStream(file0));
            bos1 = new BufferedOutputStream(new FileOutputStream(file1));
            //OutputStreamWriter osr = new OutputStreamWriter(os, StandardCharsets.UTF_8);

            byte[] buff = new byte[5*1024];
            int count;
            try {
                while ((count = bis.read(buff)) != -1) {
                    bos0.write(buff, 0, count);
                    bos1.write(buff, 0, count);
                }
            } catch (IOException e) {
                file0.delete();
                file1.delete();
            }
        } catch (IOException ex) {

        } finally {
            try {
                bis.close();
                bos0.flush();
                bos1.flush();
                bos0.close();
                bos1.close();
            } catch (IOException ignore) {
                /*ignore*/
            }
        }
    }
}
