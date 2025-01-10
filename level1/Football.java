import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize an array to store the heights of 11 players
        double height[] = new double[11];
        double sum = 0.0; // Initialize the sum variable
        
        // Prompt the user to enter the heights
        System.out.println("Enter the Height:");
        
        // Loop to read the height of each player and add it to the sum
        for (int i = 0; i < 11; i++) {
            height[i] = sc.nextDouble(); // Read the height of the current player
            sum += height[i]; // Add the height to the sum
        }
        
        // Calculate and print the mean height
        System.out.println("The mean Height is " + (sum / 11));
    }
}
