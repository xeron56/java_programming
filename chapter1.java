// Single-line comment
/*
 * Multi-line comment
 * This program demonstrates various concepts covered in Chapter 1
 */

public class chapter1 {
    public static void main(String[] args) {
        // Identifiers
        int age = 25; // Declaring and initializing an integer variable
        String name = "Alice"; // Declaring and initializing a String variable
        boolean isStudent = true; // Declaring and initializing a boolean variable

        // Array declaration
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Array initialization
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };
        System.out.println("Array length: " + names.length);
        System.out.println("First element: " + names[0]);
        System.out.println("Last element: " + names[names.length - 1]);

        // String concatenation
        String message = "Hello, " + name + "!";
        System.out.println(message);
        System.out.println("Length of the message: " + message.length());

        // 2D Array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Accessing elements of the 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);
        System.out.println("Element at row 2, column 3: " + matrix[2][3]);

        // String formatting
        String formattedMessage = String.format("My name is %s and I'm %d years old.", name, age);
        System.out.println(formattedMessage);

        // String length
        int length = message.length();
        System.out.println("Length of the message: " + length);

        // String interpolation
        String interpolatedMessage = "My name is ${name} and I'm ${age} years old.";
        System.out.println(interpolatedMessage);

        // Printing values
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
        System.out.println("Is a student: " + isStudent);

        // Arithmetic operations
        int x = 10;
        int y = 3;
        int sum = x + y; // Addition
        int diff = x - y; // Subtraction
        int prod = x * y; // Multiplication
        int quot = x / y; // Division
        int rem = x % y; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + rem);

        // Increment and decrement operators
        int count = 0;
        System.out.println("Initial count: " + count);
        count++; // Increment by 1
        System.out.println("Count after increment: " + count);
        count--; // Decrement by 1
        System.out.println("Count after decrement: " + count);

        // Relational operators
        int a = 5;
        int b = 10;
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than b? " + (a < b)); // true

        // Logical operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("AND operator: " + (condition1 && condition2)); // false
        System.out.println("OR operator: " + (condition1 || condition2)); // true
        System.out.println("NOT operator: " + (!condition1)); // false

        // If statement
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}