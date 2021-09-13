package chapter_6.exercise_p1;

public class Test {
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
/*
class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b перед вызовом: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a и b после вызовова: " + a + " " + b);
    }

 */


    class TestRef {
        int a, b;

        public TestRef(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void change(TestRef ob) {
            ob.a = ob.a + ob.b;
            ob.b = -ob.b;
        }
    }


class CallByRef {
    public static void main(String[] args) {
        TestRef ob = new TestRef(15, 20);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a и ob.b после вызовова: " + ob.a + " " + ob.b);
    }
}
