package chapter_10.answersonquestions.question_7;

import java.io.*;

/*
7. Напишите программу для копирования текстовых файлов. Видоизмените ее таким
образом, чтобы все пробелы заменялись дефисами. Используйте при написании
программы классы, представляющие байтовые потоки, а также традиционный
способ закрытия файла явным вызовом метода close () .

 */
public class CopyTextFile {
    public static void main(String[] args) {
        String stringFile;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try
        {
        reader = new BufferedReader(new FileReader("src/chapter_10/answersonquestions/question_7/text1.txt"));
        writer = new BufferedWriter(new FileWriter("src/chapter_10/answersonquestions/question_7/text2.txt"));


            while ((stringFile = reader.readLine()) != null) {

                String result = stringFile.replace(' ', '-');
                writer.write(result);
                writer.write("\n");
            }

        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }finally {
            try {
                reader.close();
            } catch (IOException ignore) {

            }
            try {
                writer.flush();
            } catch (IOException ignore) {

            }
            try {
                writer.close();
            } catch (IOException ignore) {

            }
        }
    }
}
