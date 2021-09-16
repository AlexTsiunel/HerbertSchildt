package chapter_6.exercise_62;
/*
Реализация нециклической очереди на основе массива
Нециклическая очередь не позволяет повторно использовать элементы,
поэтому поэтому со временем пространство для хранения новых элементов
исчерпывается
 */

public class Queue {
    char[] q;
    private int putloc, getloc;

    public Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    /*
    Конструктор, создающий один объект типа Queue
    на основе другого
     */

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //Копировать элементы очереди
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    Queue (char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];

        for(int i = 0; i <a.length; i++) put(a[i]);
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (putloc == getloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
/*
Тесты по Java
http://www.quizful.net/
логин: dev_ats
пароль: 65432123456
почта: alextsiunel.work@gmail.com

 */

