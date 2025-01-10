public class factors {
    public static void main(String[] args) {
        // Take the input for a number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Find the factors of the number and save them in an array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add the factor to the array
                factors[index] = i;
                index++;

                // If the index is equal to maxIndex, then need factors array to store more elements
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}