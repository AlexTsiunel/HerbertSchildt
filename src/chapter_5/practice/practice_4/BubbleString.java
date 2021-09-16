package chapter_5.practice.practice_4;

public class BubbleString {
    public static void main(String[] args) {
        String[] array = {
                "aaab",
                "aaaa",
                "aaba",
                "abaa",
                "baaa"

        };
        System.out.println("Маасив до сортировки:");
        for (String value : array) System.out.print(" " + value);
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j-1].compareTo(array[j]) > 0) {
                    String temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Маасив после сортировки:");
        for (String value : array) System.out.print(" " + value);
        System.out.println();
    }
}
