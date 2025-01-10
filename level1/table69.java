public class table69 {
    public static void main(String[] args) {
        // Read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
	int arr[]=new int [4];
	for (int i = 6; i < 10; i++) {
            arr[i-6]=number*(i);
        }
        for (int i = 6; i < 10; i++) {
            System.out.println(number + " * " + (i) + " = " + arr[i-6]);
        }
    }
} 
