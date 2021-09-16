package chapter_6.practice.practice_13;

public class Test {
    public static void main(String[] args) {
        System.out.println(sum(2, 5, 6, -2));
        System.out.println(sum());
    }

    public static int sum(int... arg) {
        int result = 0;
        for (int x : arg) {
            result += x;
        }
        return result;
    }
}
