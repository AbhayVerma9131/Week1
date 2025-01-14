import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        String upperCaseText = text.toUpperCase();
        String lowerCaseText = toLowerCase(text);
        boolean isEqual = compareStrings(upperCaseText, lowerCaseText);
        System.out.println("Is equal: " + isEqual);
        String[][] wordsWithLengths = splitTextIntoWords(text);
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }
    }

    public static String toLowerCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
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

    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split("\\s+");
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(words[i].length());
        }
        return wordsWithLengths;
    }
}