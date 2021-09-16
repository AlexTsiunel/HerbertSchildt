package chapter_5.practice.practice_4;

public class Test {
    public static void main(String[] args) {
        String str2 = "hshhtr";
        String str1 = "thrt";
        System.out.println(str1.compareTo(str2));
        System.out.println(compareTo(str1, str2));
        System.out.println(str2.indexOf('t'));
    }

    /**
     * Метод определяет лексикографический порядок строк. Он выполняет сравнение значения char,
     * действуя аналогично equals().
     * Когда 2 строки совпадают, compareTo() вернёт значение «ноль» (результат = 0).
     * Сравнивая 2 строки, он вернёт положительное целое число (результат > 0), если 1-й объект String следует за 2-й строкой.
     * Соответственно, метод вернёт отрицательный результат (результат < 0), когда 1-й объект String будет предшествовать 2-й строке:
     *
     * @param str1
     * @param str2
     * @return
     */

    public static int compareTo(String str1, String str2) {
        int result = 0;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int lengthMin = Math.min(str1.length(), str2.length());
        for (int i = 0; i < lengthMin; i++) {
            if ((int) arr1[i] < (int) arr2[i]) {
                result = -1;
                break;
            } else if ((int) arr1[i] > (int) arr2[i]) {
                result = 1;
                break;
            }
        }
        if (result == 0){
            if (str1.length() > str2.length()) result = 1;
            else result =-1;
        }
        return result;
    }
}
