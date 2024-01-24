import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert Array to ArrayList
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        Integer[] array = new Integer[size];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        List<Integer> arrayListFromArr = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array converted to ArrayList: " + arrayListFromArr);

        // Convert ArrayList to Array
        System.out.println("Enter the size of the ArrayList:");
        int listSize = scanner.nextInt();
        List<String> stringList = new ArrayList<>();

        System.out.println("Enter elements for the ArrayList:");
        for (int i = 0; i < listSize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            stringList.add(scanner.next());
        }

        String[] arrayFromList = stringList.toArray(new String[0]);
        System.out.println("ArrayList converted to Array: " + Arrays.toString(arrayFromList));
    }
}
