package nrcm.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt", true);

            writer.write("\nCollege: NRCM");

            writer.close();

            System.out.println("Data appended successfully");

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
