import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class chapter5 {
    public static void main(String[] args) {
        // java.lang package
        System.out.println("java.lang package examples:");
        String str = "Hello, World!";
        System.out.println("String length: " + str.length());
        System.out.println("String uppercase: " + str.toUpperCase());
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println();

        // java.util package
        System.out.println("java.util package examples:");
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Random numbers: " + numbers);

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println("Ages: " + ages);
        System.out.println();

        // java.io package
        System.out.println("java.io package examples:");
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("Contents of example.txt:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

            PrintWriter writer = new PrintWriter("output.txt");
            writer.println("This is a sample text.");
            writer.println("Written to output.txt");
            writer.close();
            System.out.println("File written successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        System.out.println();

        // java.nio package
        System.out.println("java.nio package examples:");
        Path path = Paths.get("example.txt");
        System.out.println("File path: " + path);
        System.out.println("File exists: " + path.toFile().exists());
        System.out.println();

        // java.time package
        System.out.println("java.time package examples:");
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        System.out.println();

        // java.util.stream package
        System.out.println("java.util.stream package examples:");
        int[] numbers1 = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers1).sum();
        System.out.println("Sum of numbers: " + sum);
    }
}