import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter your student ID: ");
            // takes input and handles the conversion
            int studentId = Integer.parseInt(input.nextLine());
            
            System.out.println("Student ID " + studentId + " has been recorded.");
            
        } catch (NumberFormatException e) {
            // handles letters/symbols input error
            System.out.println("Error: Invalid input. Please enter a numeric ID only.");
        } finally {
            // ensures resource is closed
            input.close();
            System.out.println("Session finished.");
        }
    }
}
