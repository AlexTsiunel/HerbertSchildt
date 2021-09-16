package chapter_6.practice.practice_3;


public class Stack {
    private char[] q;
    private int loc;


    public Stack(int size) {
        q = new char[size + 1];
        loc = 0;
    }

    public void push(char ch) {
        if (loc == q.length - 1) {
            System.out.println(" - Стек заполнен");
            return;
        }
        loc++;
        q[loc] = ch;

    }

    public char pop() {
        if (loc == 0) {
            System.out.println(" - Стек пуст");
            return (char) 0;
        }
        char result = q[loc];
        loc--;
        return result;
    }

    public void show() {
        if (loc == 0) {
            System.out.println("Стек пуст");
            return;
        }
        for (int i = 1; i <= loc; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
