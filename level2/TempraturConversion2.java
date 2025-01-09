import java.util.Scanner;
public class TempraturConversion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9;
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n", fahrenheit, celsius);
    }
}
