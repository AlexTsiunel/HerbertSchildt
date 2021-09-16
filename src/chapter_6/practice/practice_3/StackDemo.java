package chapter_6.practice.practice_3;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        System.out.println("Использование очереди bigQ для сохранения алфавита");
        for (int i = 0; i < 6; i++) {
            stack.push((char) ('A' + i));
        }
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
