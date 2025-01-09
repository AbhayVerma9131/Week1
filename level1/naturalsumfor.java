import java.util.Scanner;
public class naturalsumfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of natural numbers to sum
        int sumfor = 0;

        for (int i = 0; i <= n; i++) {
            sumfor += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum of " + n + " natural numbers using while loop: " + sumfor);
        System.out.println("Sum of " + n + " natural numbers using formula: " + sumFormula);

        if (sumfor == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Computations are incorrect.");
        }
    }
}