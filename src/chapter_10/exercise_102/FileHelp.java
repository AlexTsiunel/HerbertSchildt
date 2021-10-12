package chapter_10.exercise_102;

public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("src/chapter_10/exercise_102/helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой. \n" +
                "Для выхода из системы введите 'stop'");
        do {
            topic = help.getSelection();
            if (!help.helpon(topic))
                System.out.println("Тема не найдена.\n");

        } while (topic.compareTo("stop") != 0);
    }
}
