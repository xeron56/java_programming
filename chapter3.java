public class chapter3 {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Strings
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Concatenation: " + str1.concat(" " + str2));

        // ArrayList
        System.out.println("\nArrayList:");
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Element at index 1: " + names.get(1));
        names.set(2, "Carol");
        for (String name : names) {
            System.out.println(name);
        }

        // HashSet
        System.out.println("\nHashSet:");
        java.util.HashSet<Integer> uniqueNumbers = new java.util.HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(20); // Duplicate, will be ignored
        System.out.println("Size: " + uniqueNumbers.size());
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }

        // HashMap
        System.out.println("\nHashMap:");
        java.util.HashMap<String, Integer> ages = new java.util.HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println("Bob's age: " + ages.get("Bob"));
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
    }
}