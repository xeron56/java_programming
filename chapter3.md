# Chapter 3: Arrays, Strings, and Collections

In this chapter, we'll explore arrays, strings, and collections in Java, which are essential concepts for managing and manipulating data in your programs.

## Arrays

An array is a collection of elements of the same data type, stored in contiguous memory locations. Arrays in Java are objects, and they have a fixed size that cannot be changed after creation.

### Declaring and Initializing Arrays

You can declare an array in Java like this:

```java
int[] numbers; // Preferred way
// or
int numbers[]; // Valid but not recommended
```

To initialize an array, you can either specify its size and optionally provide initial values, or use an array literal:

```java
// Specifying the size
int[] numbers = new int[5]; // {0, 0, 0, 0, 0}

// Providing initial values
int[] numbers = {10, 20, 30, 40, 50};

// Array literal
int[] numbers = new int[] {10, 20, 30, 40, 50};
```

### Accessing and Modifying Array Elements

Array elements are accessed using an index, starting from 0:

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30

numbers[3] = 45; // Modifying the value at index 3
```

### Multi-dimensional Arrays

Java also supports multi-dimensional arrays, which are arrays of arrays.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]); // Output: 6
```

## Strings

In Java, strings are objects of the `String` class. They represent a sequence of characters.

### Creating Strings

You can create strings using string literals or the `new` keyword:

```java
String str1 = "Hello"; // String literal
String str2 = new String("World"); // Using the new keyword
```

### String Operations

Strings in Java are immutable, meaning they cannot be modified once created. However, you can perform various operations on them:

```java
String str = "Hello";
System.out.println(str.length()); // Output: 5
System.out.println(str.toUpperCase()); // Output: HELLO
System.out.println(str.concat(" World")); // Output: Hello World

String combined = str + " World"; // Concatenation using +
```

The `String` class provides many useful methods for manipulating strings, such as `substring()`, `replace()`, `split()`, and more.

## Collections

The Java Collections Framework provides several classes and interfaces for storing and manipulating groups of objects. Some of the commonly used collections are `ArrayList`, `HashSet`, `HashMap`, and `LinkedList`.

### ArrayList

An `ArrayList` is a resizable-array implementation of the `List` interface. It allows you to store and access elements by index.

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

System.out.println(names.get(1)); // Output: Bob
names.set(2, "Carol"); // Modifying an element

for (String name : names) {
    System.out.println(name);
}
```

### HashSet

A `HashSet` is an implementation of the `Set` interface, which stores unique elements.

```java
import java.util.HashSet;

HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(20); // Duplicate, will be ignored

System.out.println(numbers.size()); // Output: 3

for (int number : numbers) {
    System.out.println(number);
}
```

### HashMap

A `HashMap` is an implementation of the `Map` interface, which stores key-value pairs.

```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);

System.out.println(ages.get("Bob")); // Output: 30

for (String name : ages.keySet()) {
    System.out.println(name + " is " + ages.get(name) + " years old.");
}
```

In the next chapter, we'll explore more advanced topics, such as exception handling, file I/O, and Java's built-in packages and APIs.