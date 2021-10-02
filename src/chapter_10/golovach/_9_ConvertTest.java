package chapter_10.golovach;

import java.io.ByteArrayInputStream;

public class _9_ConvertTest {
    public static void main(String[] args) {
        byte[] array = {
                -128,-127,-126,-3,-2,-1,
                0,
                1,2,3,125,126,127
        };
        for (byte byteValue: array){
            int intValue = new ByteArrayInputStream(new byte[]{byteValue}).read();
            System.out.println("byte (" + byteValue + ") -> (" + intValue+ ")");
        }
    }
}
