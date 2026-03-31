import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();
        String filename = "students.txt";

        try {
            System.out.print("Enter Student Name or ID: ");
            String data = input.nextLine();
            studentList.add(data); 

            // SAVING TO FILE
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            writer.write(data);
            writer.newLine();
            writer.close();
            System.out.println("Successfully saved to " + filename);

            // READING FROM FILE
            System.out.println("\n--- All Records in File ---");
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
