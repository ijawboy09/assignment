
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter value for element at index [" + i + "]:");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nThe values in the array are:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
 