import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = array[i];
            } else if (array[i] > thirdLargest && array[i] != secondLargest && array[i] != largest) {
                thirdLargest = array[i];
            }
        }
        System.out.println("The third largest number is: " + thirdLargest);
        scanner.close();
    }
}