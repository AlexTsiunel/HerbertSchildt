package chapter_10.answersonquestions.question_8;

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
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/chapter_10/answersonquestions/question_8/text1.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/chapter_10/answersonquestions/question_8/text2.txt"))) {

            while ((stringFile = reader.readLine()) != null) {

                String result = stringFile.replace(' ', '-');
                writer.write(result);
                writer.write("\n");
            }

        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);

        }
    }
}
