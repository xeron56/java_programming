import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class chapter6 {
    public static void main(String[] args) {
        // Generics
        System.out.println("Generics:");
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer Box: " + intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String Box: " + stringBox.get());

        System.out.println("Array elements:");
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        printArray(intArray);
        printArray(stringArray);
        System.out.println();

        // Lambda Expressions
        System.out.println("Lambda Expressions:");
        Operation addition = (a, b) -> a + b;
        Operation multiplication = (a, b) -> { return a * b; };
        System.out.println("3 + 4 = " + addition.operate(3, 4));
        System.out.println("3 * 4 = " + multiplication.operate(3, 4));
        System.out.println();

        // Streams
        System.out.println("Streams:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> longNames = names.stream()
                                      .filter(name -> name.length() > 4)
                                      .sorted()
                                      .collect(Collectors.toList());
        System.out.println("Long names: " + longNames);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers)
                       .parallel()
                       .filter(n -> n % 2 == 0)
                       .sum();
        System.out.println("Sum of even numbers: " + sum);
    }

    // Generic class
    static class Box<T> {
        private T item;

        public void set(T item) {
            this.item = item;
        }

        public T get() {
            return item;
        }
    }

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Functional interface for lambda expressions
    interface Operation {
        int operate(int a, int b);
    }
}