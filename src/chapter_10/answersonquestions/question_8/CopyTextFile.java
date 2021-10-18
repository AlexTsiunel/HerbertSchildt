package chapter_10.answersonquestions.question_8;

import java.io.*;

/*
8. Перепишите программу, созданную в предыдущем пункте, таким образом, чтобы
в ней использовались классы, представляющие символьные потоки. На этот раз
воспользуйтесь оператором try с ресурсами для автоматического закрытия файла.
 */
public class CopyTextFile {
    public static void main(String[] args) {
        int x;

        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/chapter_10/answersonquestions/question_8/text1.txt"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/chapter_10/answersonquestions/question_8/text2.txt"))
        ) {

            while ((x = in.read()) != -1) {
                if ((char) x == ' ') {
                    out.write((char) 45);
                } else {
                    out.write((char) x);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
