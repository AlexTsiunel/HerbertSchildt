package chapter_6.practice.practice_4;

public class Test {
    private int a;

    public Test(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void swap(Test other){
        int temp = this.a;
        this.a = other.a;
        other.a = temp;
    }
}
