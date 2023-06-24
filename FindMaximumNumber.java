import java.util.Scanner;

public class FindMaximumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the values of the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum Number: " + max);
        System.out.println("Position of First Occurrence: " + maxIndex);
    }
}