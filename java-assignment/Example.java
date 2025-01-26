import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Enter value for element at index [" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nThe values in the 2D array are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
 
