import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        
        // Conversion factor
        double conversionFactor = 2.2;
        
        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / conversionFactor;
        
        // Output the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms);
    }
}
