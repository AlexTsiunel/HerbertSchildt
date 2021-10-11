package chapter_10.betacode;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class ReadDataFile {
    private static final String filePath = "C:/Users/Leshii82/IdeaProjects/HerbertSchildt/src/chapter_10/betacode/data-file.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(filePath);

        InputStream inputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int row = 0;

        System.out.printf("|%3s | %-10s | %10s | %-15s | %8s| %10s | %10s |%n", //
                "No", "Order Date", "Finished?", "Item", "Units", "Unit Cost", "Total");

        System.out.printf("|%3s | %-10s | %10s | %-15s | %8s| %10s | %10s |%n", //
                "--", "---------", "----------", "----------", "------", "---------", "---------");

        while (dataInputStream.available() > 0) {
            row++;
            String orderDate = dataInputStream.readUTF();
            boolean finished = dataInputStream.readBoolean();
            String item = dataInputStream.readUTF();
            int units = dataInputStream.readInt();
            float unitCost = dataInputStream.readFloat();
            float total = dataInputStream.readFloat();

            System.out.printf("|%3d | %-10s | %10b | %-15s | %8d| %,10.2f | %,10.2f |%n", //
                    row, orderDate, finished, item, units, unitCost, total);
        }
        dataInputStream.close();
    }
}
