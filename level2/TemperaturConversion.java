import java.util.Scanner;
public class TemperaturConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius:");
        int temp=scanner.nextInt();
        int f=(temp*9/5)+32;
        System.out.println("Temperature in farehanit is: " + f);
    }
}
