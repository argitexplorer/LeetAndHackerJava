import java.io.*;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {

        String s = "There's a starman-waiting-in-the-sky";

        int k = 3;

        String result = Result.cipher(s, k);

    }
}

class Result {
    public static String cipher(String s, int k) {
        // Ensure the shift value k is within the range of 0-25
        k = k % 26;

        StringBuilder sb = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is uppercase, shift it within the 'A' to 'Z' range
            if (Character.isUpperCase(ch)) {
                sb.append((char) ('A' + (ch - 'A' + k) % 26));
            }
            // If the character is lowercase, shift it within the 'a' to 'z' range
            else if (Character.isLowerCase(ch)) {
                sb.append((char) ('a' + (ch - 'a' + k) % 26));
            }
            // If the character is neither uppercase nor lowercase, don't shift it
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

