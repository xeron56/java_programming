# Chapter 6: Generics, Lambda Expressions, and Streams

In this chapter, we'll explore some of the advanced features introduced in later versions of Java, such as generics, lambda expressions, and streams.

## Generics

Generics are a feature of Java that allows you to write code that can work with different data types while providing type safety and avoiding type casts. They were introduced in Java 5.

### Generic Classes

You can define a generic class that can work with any data type by using a type parameter, which acts as a placeholder for the actual data type:

```java
class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
```

In this example, `T` is the type parameter, and it can be replaced with any concrete data type when creating an instance of the `Box` class:

```java
Box<Integer> intBox = new Box<>();
intBox.set(10);
System.out.println(intBox.get()); // Output: 10

Box<String> stringBox = new Box<>();
stringBox.set("Hello");
System.out.println(stringBox.get()); // Output: Hello
```

### Generic Methods

You can also define generic methods that can operate on different data types:

```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

This `printArray` method can be called with arrays of any data type:

```java
Integer[] intArray = {1, 2, 3, 4, 5};
printArray(intArray); // Output: 1 2 3 4 5

String[] stringArray = {"Hello", "World"};
printArray(stringArray); // Output: Hello World
```

## Lambda Expressions

Lambda expressions are a concise way to represent anonymous functions in Java. They were introduced in Java 8, along with functional programming features.

### Syntax

The basic syntax of a lambda expression is:

```java
(parameters) -> expression
// or
(parameters) -> { statements; }
```

Here's an example of using a lambda expression with a functional interface:

```java
interface Operation {
    int operate(int a, int b);
}

Operation addition = (a, b) -> a + b;
Operation multiplication = (a, b) -> { return a * b; };

System.out.println(addition.operate(3, 4)); // Output: 7
System.out.println(multiplication.operate(3, 4)); // Output: 12
```

In this example, `addition` and `multiplication` are lambda expressions that implement the `operate` method of the `Operation` functional interface.

## Streams

Streams are a powerful feature introduced in Java 8 that allow you to perform sequential and parallel operations on collections and arrays. They provide a declarative and functional-style approach to data processing.

### Creating Streams

You can create a stream from various sources, such as collections, arrays, or other streams:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Stream<String> nameStream = names.stream();

int[] numbers = {1, 2, 3, 4, 5};
IntStream numberStream = Arrays.stream(numbers);
```

### Stream Operations

Streams support various operations, such as filtering, mapping, sorting, and reducing. These operations can be chained together in a fluent manner:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
List<String> longNames = names.stream()
                              .filter(name -> name.length() > 4)
                              .sorted()
                              .collect(Collectors.toList());

System.out.println(longNames); // Output: [Alice, Charlie, David]
```

In this example, we filter the names list to include only names longer than 4 characters, sort the filtered list, and collect the result into a new list.

Streams also support parallel processing, which can improve performance on multi-core systems:

```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum = Arrays.stream(numbers)
                 .parallel()
                 .filter(n -> n % 2 == 0)
                 .sum();

System.out.println(sum); // Output: 30
```

In this example, we use the `parallel()` operation to enable parallel processing when computing the sum of even numbers in the `numbers` array.

In the next chapter, we'll explore more advanced topics, such as multithreading, networking, and Java's concurrency utilities.