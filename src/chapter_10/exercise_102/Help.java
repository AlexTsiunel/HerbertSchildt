package chapter_10.exercise_102;

import java.io.*;
import java.sql.SQLOutput;

public class Help {
    private String helpfile;

    public Help(String helpfile) {
        this.helpfile = helpfile;
    }

    /*
    Метод helpon извлекает справочную информацию по заданной теме
     */
    boolean helpon(String what) {
        int ch;
        String topic, info;

        //Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                //Читать символы до тех пор, пока не встретится символ #
                ch = helpRdr.read();
                //Проверить, совпадают ли темы
                if ((ch == '#')) {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        //найти тему
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) &&
                                (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false; //тема не найдена
    }

    public String getSelection(){
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите название темы:");
        try {
            topic = br.readLine();
        }catch (IOException e){
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}


// OutputStream out = new BufferedOutputStream(new FileWriter(System.out))
//String fileName = "src/chapter_10/exercise_102/help.txt";