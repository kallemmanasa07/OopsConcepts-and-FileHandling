package nrcm.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Manasa\n");
            writer.write("Branch: CSE\n");
            writer.write("Year: 4");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}