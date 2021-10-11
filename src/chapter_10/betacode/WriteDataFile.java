package chapter_10.betacode;

import java.io.*;
import java.time.LocalDate;

public class WriteDataFile {
    private static final String filePath = "C:/Users/Leshii82/IdeaProjects/HerbertSchildt/src/chapter_10/betacode/data-file.txt";

    public static void main(String[] args) throws IOException {
        Order[] orders = new Order[]{
                new Order(LocalDate.of(2020, 1, 6), true, "Pencil", 95, 1.99f, 189.05f),
                new Order(LocalDate.of(2020, 1, 23), false, "Binder", 50, 19.99f, 999.50f),
                new Order(LocalDate.of(2020, 2, 9), true, "Pencil", 36, 4.99f, 179.64f),
                new Order(LocalDate.of(2020, 2, 26), false, "Pen", 27, 19.99f, 539.73f),
                new Order(LocalDate.of(2020, 3, 15), true, "Pencil", 56, 2.99f, 167.44f)
        };
        File outFile = new File(filePath);
        outFile.getParentFile().mkdir();

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outFile));

        for(Order order : orders){
            dataOutputStream.writeUTF(order.getOrderDate().toString());
            dataOutputStream.writeBoolean(order.isFinished());
            dataOutputStream.writeUTF(order.getItem());
            dataOutputStream.writeInt(order.getUnits());
            dataOutputStream.writeFloat(order.getUnitCost());
            dataOutputStream.writeFloat(order.getTotal());
        }
        dataOutputStream.close();
    }
}
