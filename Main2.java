import java.util.Scanner;

public class Main2 {
    public static int findNearestNeighborsIndex(int[] array) {
        if (array.length < 2) {
            // Handle cases where the array has less than 2 elements
            System.out.println("Array should have at least two elements");
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int indexOfFirstNumber = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                indexOfFirstNumber = i;
            }
        }

        return indexOfFirstNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Take input for the array elements
        int[] numbers = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the index of the first number with the smallest distance
        int resultIndex = findNearestNeighborsIndex(numbers);

        if (resultIndex != -1) {
            System.out.println("Index of the first number with the smallest distance: " + resultIndex);
        }
    }
}
