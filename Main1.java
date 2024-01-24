import java.util.ArrayList;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] numbers = scanner.nextLine().split(" ");

        for (String num : numbers) {
            int n = Integer.parseInt(num);
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
