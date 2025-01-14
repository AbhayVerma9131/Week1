import java.util.Scanner;
public class words2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        String[] words = splitTextIntoWords(text);
        String[][] wordLengths = getWordLengths(words);
        displayWordLengths(wordLengths);
    }

    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[wordIndex] = word;
        return words;
    }

    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

    public static void displayWordLengths(String[][] wordLengths) {
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + "\t" + Integer.parseInt(wordLengths[i][1]));
        }
    }
}