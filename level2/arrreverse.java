public class arrreverse {
    public static void main(String[] args) {
        // Take user input for a number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the elements of the array in reverse order
        System.out.println("Reversed digits:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}