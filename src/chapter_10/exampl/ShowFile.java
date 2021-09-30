package chapter_10.exampl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Ниже приведен пример программы, в которой метод read () используется для
получения и отображения содержимого текстового файла. Имя файла указывается
в командной строке при запуске программы. Обратите внимание на то, что ошибки
ввода-вывода обрабатываются с помощью блока try/catch.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // Прежде всего необходимо убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Иcnoльзoвaниe: ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]); // Открыть файл
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }
        //Читать байты, пока не встретится символ EOF
        try {
            do {
                i = fin.read(); //Читать из файла
                if (i != -1) System.out.println((char) i);
            } while (i != -1);     // Значение переменной i, равное -1, означает
            // достижение конца файла
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}

/*
Ввод аргументов командной строки
ALT+SHIFT+F10, Вправо, E, Enter, Tab, введите параметры командной строки

СТР 363
 */