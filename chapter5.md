# Chapter 4: Exception Handling and File I/O

In this chapter, we'll explore exception handling and file input/output (I/O) operations in Java.

## Exception Handling

Exceptions are events that occur during the execution of a program that disrupts the normal flow of instructions. Java provides a robust exception handling mechanism to deal with such exceptional situations.

### Try-Catch Block

The `try-catch` block is used to handle exceptions in Java. The code that may throw an exception is placed inside the `try` block, and the corresponding exception handling code is placed inside one or more `catch` blocks.

```java
try {
    // Code that may throw an exception
    int result = 10 / 0; // This will throw an ArithmeticException
} catch (ArithmeticException e) {
    // Exception handling code
    System.out.println("Error: Division by zero");
}
```

### Multiple Catch Blocks

You can have multiple `catch` blocks to handle different types of exceptions.

```java
try {
    // Code that may throw an exception
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error occurred");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of bounds");
}
```

### Finally Block

The `finally` block is an optional block that is always executed, regardless of whether an exception is thrown or not. It is typically used for clean-up code, such as closing resources or releasing acquired locks.

```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Exception handling code
} finally {
    // Clean-up code
    System.out.println("This will always be executed");
}
```

## File I/O

Java provides several classes and interfaces for performing file input/output operations, such as reading from and writing to files, creating and deleting files and directories, and more.

### Reading from a File

Here's an example of reading the contents of a text file:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

### Writing to a File

Here's an example of writing text to a file:

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a sample text.");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

Java provides many other classes and methods for more advanced file I/O operations, such as buffered I/O, random access files, and more.

In the next chapter, we'll explore Java's built-in packages and APIs, which provide a wide range of functionality for various tasks, such as working with dates and times, networking, and more.