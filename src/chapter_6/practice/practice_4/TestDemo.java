package chapter_6.practice.practice_4;

public class TestDemo {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(2);
        test1.swap(test2);
        System.out.println(test1.getA());
        System.out.println(test2.getA());
    }
}
