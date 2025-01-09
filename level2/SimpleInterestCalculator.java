import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Principal, Rate, and Time values
        System.out.println("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the Time in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +", Rate of Interest " + rate + " and Time " + time);
    }
}
