public class table {
    public static void main(String[] args) {
        // Read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
	int arr[]=new int [10];
	for (int i = 0; i < 10; i++) {
            arr[i]=number*(i+1);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + (i+1) + " = " + arr[i]);
        }
    }
} 
