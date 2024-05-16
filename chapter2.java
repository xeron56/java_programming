// Class definition
class Person {
    // Private properties (encapsulation)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods (encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}

// Inheritance example
class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age); // Call the superclass constructor
        this.studentId = studentId;
    }

    // Getter and Setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method overriding
    @Override
    public void greet() {
        System.out.println("Hello, I'm a student with ID " + studentId + ". My name is " + getName() + " and I'm " + getAge() + " years old.");
    }
}

// Method overloading example
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class chapter2 {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("Alice", 25);
        person1.greet(); // Output: Hello, my name is Alice and I'm 25 years old.

        // Creating Student object (inheritance)
        Student student1 = new Student("Bob", 20, "123456");
        student1.greet(); // Output: Hello, I'm a student with ID 123456. My name is Bob and I'm 20 years old.

        // Using methods with different parameter types (method overloading)
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(2, 3); // Output: 5
        double sum2 = calculator.add(2.5, 3.7); // Output: 6.2
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
    }
}