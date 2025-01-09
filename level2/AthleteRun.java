import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the sides of the triangle
        System.out.print("Enter side1 in meters: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side2 in meters: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side3 in meters: ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Total distance the athlete wants to run (5 km = 5000 meters)
        double totalDistance = 5000.0;
        
        // Calculate the number of rounds needed
        double rounds = totalDistance / perimeter;
        
        // Output the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is: " + rounds);
        
        // Close the scanner
        scanner.close();
    }
}
