# Chapter 2: Object-Oriented Programming in Java

One of the key features of Java is its support for object-oriented programming (OOP). OOP is a programming paradigm that focuses on creating objects that contain data (properties) and code (methods) to manipulate that data. It promotes code reusability, modularity, and encapsulation, making it easier to develop and maintain complex software systems.

## Classes and Objects

In Java, a class is a blueprint or a template for creating objects. It defines the properties (variables) and behaviors (methods) that an object of that class will have. An object is an instance of a class, created from the class blueprint.

Here's an example of a simple `Person` class:

```java
public class Person {
    // Properties
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
```

To create an object of the `Person` class, you can use the `new` keyword followed by the constructor:

```java
Person person1 = new Person("Alice", 25);
person1.greet(); // Output: Hello, my name is Alice and I'm 25 years old.
```

## Access Modifiers

Java provides four types of access modifiers to control the visibility and accessibility of classes, variables, and methods:

1. **`public`**: Accessible from anywhere.
2. **`private`**: Accessible only within the same class.
3. **`protected`**: Accessible within the same package and subclasses in different packages.
4. **`default`** (no modifier): Accessible only within the same package.

```java
public class MyClass {
    public int x; // Public variable, accessible from anywhere
    private int y; // Private variable, accessible only within MyClass
    protected int z; // Protected variable, accessible within the package and subclasses
    int w; // Default variable, accessible only within the package
}
```

## Encapsulation

Encapsulation is one of the fundamental principles of OOP, which involves bundling data and methods together into a single unit (class) and controlling access to the data through carefully designed methods. This helps in achieving data abstraction and data hiding.

In Java, encapsulation is achieved through the use of access modifiers (`public`, `private`, `protected`) and getter and setter methods.

```java
public class BankAccount {
    private double balance; // Private variable

    public double getBalance() { // Getter method
        return balance;
    }

    public void deposit(double amount) { // Setter method
        balance += amount;
    }
}
```

## Inheritance

Inheritance is another important concept in OOP, which allows a new class (subclass or derived class) to be created from an existing class (superclass or base class). The subclass inherits the properties and methods of the superclass and can add new properties and methods or override the inherited methods.

In Java, inheritance is achieved using the `extends` keyword.

```java
class Vehicle {
    private int wheels;

    public int getWheels() {
        return wheels;
    }
}

class Car extends Vehicle {
    private String model;

    public String getModel() {
        return model;
    }
}
```

In this example, the `Car` class inherits the `wheels` property and `getWheels()` method from the `Vehicle` class.

## Polymorphism

Polymorphism is the ability of an object to take on many forms. In Java, polymorphism is achieved through method overloading and method overriding.

**Method Overloading**: Method overloading is when two or more methods in the same class have the same name but different parameters (different number of parameters, different types of parameters, or both).

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

**Method Overriding**: Method overriding is when a subclass provides its own implementation of a method that is already defined in the superclass. The overridden method in the subclass must have the same signature (name, return type, and parameters) as the method in the superclass.

```java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
```

In this example, the `Dog` class overrides the `makeSound()` method inherited from the `Animal` class.

These concepts are fundamental to understanding and applying object-oriented programming in Java. In the next chapter, we will explore more advanced topics, such as abstraction, interfaces, and generics.