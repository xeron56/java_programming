import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class chapter4 {
    public static void main(String[] args) {
        // Exception Handling Examples
        System.out.println("Exception Handling Examples:");

        // ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        // InputMismatchException
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }

        // File I/O Examples
        System.out.println("\nFile I/O Examples:");

        // Reading from a file
        try {
            File file = new File("example.txt");
            Scanner fileScanner = new Scanner(file);

            System.out.println("Contents of example.txt:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        // Writing to a file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a sample text.\nWritten to output.txt");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred");
        }
    }
}