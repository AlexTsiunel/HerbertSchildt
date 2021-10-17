import java.io.*;

public class Test_1 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream= new FileOutputStream("C:/Users/Leshii82/IdeaProjects/HerbertSchildt/src/output.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");

        outputStreamWriter.write("Alex");
        outputStreamWriter.close();

        File file = new File("C:/Users/Leshii82/IdeaProjects/HerbertSchildt/" +
                "src/output.txt");
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        file.renameTo(new File("C:/Users/Leshii82/IdeaProjects/HerbertSchildt/src/output2.txt"));
        //System.out.println(file.delete());
        //System.out.println(file.getPath());
    }
}
