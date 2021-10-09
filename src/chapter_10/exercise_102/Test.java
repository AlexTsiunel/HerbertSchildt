package chapter_10.exercise_102;

public class Test {
    public static void main(String[] args) {
        Help help = new Help("src/chapter_10/exercise_102/helpfile.txt");
        help.helpon(help.getSelection());
    }
}
