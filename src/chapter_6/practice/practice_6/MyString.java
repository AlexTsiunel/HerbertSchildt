package chapter_6.practice.practice_6;

public class MyString {
    public static String reverse (String str){
        char [] ch = str.toCharArray();
        for (int i = 0; i < ch.length/2; i++){
            char temp = ch[i];
            ch[i] = ch[(ch.length-1)-i];
            ch[(ch.length-1)-i] = temp;
        }
        String result = new String(ch);
        return result;
    }
}
