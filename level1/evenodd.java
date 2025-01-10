import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        // Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Input is not a natural number.");
            System.exit(0);
        }

        // Create integer arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to the number and save odd or even numbers into the corresponding array
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd and even numbers array
        System.out.println("Even numbers array:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers array:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
