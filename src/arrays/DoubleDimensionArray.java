package arrays;


public class DoubleDimensionArray {
    // Declare a 2D array
    int[][] arr;

    // Constructor to initialize the 2D array
    public DoubleDimensionArray(int rows, int cols) {
        arr = new int[rows][cols]; // All elements default to 0
    }

    // Insert method: Inserts an element at a specific row and column
    public void insert(int row, int col, int value) {
        if (row >= 0 && row < arr.length && col >= 0 && col < arr[0].length) {
            arr[row][col] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Traverse method: Prints the entire array
    public void traverse() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Search method: Searches for an element and prints its location
    public void search(int value) {
        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Element " + value + " found at row " + row + ", column " + col);
                    found = true;
                    return; // Stop searching after finding the first match
                }
            }
        }
        if (!found) {
            System.out.println("Element " + value + " not found.");
        }
    }

    // Delete method: Deletes the element at a specific row and column (resets to 0)
    public void delete(int row, int col) {
        if (row >= 0 && row < arr.length && col >= 0 && col < arr[0].length) {
            System.out.println("Element at row " + row + ", column " + col + " deleted.");
            arr[row][col] = 0; // Reset the element to 0 (or any other default value)
        } else {
            System.out.println("Invalid index");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a 3x3 double dimension array
        DoubleDimensionArray ddArray = new DoubleDimensionArray(3, 3);

        // Insert elements into the array
        ddArray.insert(0, 0, 5);
        ddArray.insert(1, 1, 8);
        ddArray.insert(2, 2, 12);

        // Traverse the array to display all elements
        System.out.println("Array after insertion:");
        ddArray.traverse();

        // Search for an element
        System.out.println("Searching for element 8:");
        ddArray.search(8);

        // Delete an element at a specific index
        System.out.println("Deleting element at row 1, column 1:");
        ddArray.delete(1, 1);

        // Traverse the array again after deletion
        System.out.println("Array after deletion:");
        ddArray.traverse();
    }
}
