import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        String uppercaseText = toUppercase(text);
        String uppercaseTextBuiltIn = text.toUpperCase();
        boolean isEqual = compareStrings(uppercaseText, uppercaseTextBuiltIn);
        System.out.println("Converted to uppercase: " + uppercaseText);
        System.out.println("Is equal to built-in uppercase: " + isEqual);
    }

    public static String toUppercase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                uppercaseText.append((char) (c - 32));
            } else {
                uppercaseText.append(c);
            }
        }
        return uppercaseText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
} 