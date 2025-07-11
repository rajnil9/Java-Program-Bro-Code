import java.util.*;

class ListExample {
    public static void main(String[] args) {
        // ARRAYLIST PROBLEM 
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        System.out.print("Enter the size of ArrayList: ");
        int len = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Taking input
        for (int i = 1; i <= len; i++) {
            System.out.print("Enter the food at #" + i + ": ");
            String f = sc.nextLine();
            fruits.add(f);
        }

        System.out.println("\nYour fruits list: " + fruits);

        // Safe removal at index 3
        if (fruits.size() > 3) {
            fruits.remove(3);
            System.out.println("Fruits list after removing index 3: " + fruits);
        } else {
            System.out.println("Cannot remove index 3, list too small.");
        }

        // Sorting
        Collections.sort(fruits);
        System.out.println("Fruits after sorting: " + fruits);

        // Safe setting at index 1
        if (fruits.size() > 1) {
            fruits.set(1, "Cocoa");
            System.out.println("Updated fruit at index 1: " + fruits.get(1));
        } else {
            System.out.println("Cannot update index 1, list too small.");
        }
        
        // Display length and final list
        System.out.println("Current length: " + fruits.size());
        System.out.println("Final Fruits: " + fruits);
    }
}
