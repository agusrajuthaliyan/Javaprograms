import java.util.*;

public class Hashsetdemo {
    public static void main(String[] args) {
        // Create a new HashSet
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Check if an element exists in the HashSet
        System.out.println("Is Apple in the HashSet? " + hashSet.contains("Apple"));

        // Remove an element from the HashSet
        hashSet.remove("Banana");

        // Print the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Print all elements in the HashSet
        System.out.println("Elements in the HashSet: " + hashSet);
    }
}
