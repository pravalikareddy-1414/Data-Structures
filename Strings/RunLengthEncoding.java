import java.util.*;

public class RunLengthEncoding {
    public static String encode(String message) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for (int i = 1; i < message.length(); i++) {
            if (message.charAt(i) == message.charAt(i - 1)) {
                counter++;
            } else {
                sb.append(message.charAt(i - 1));
                sb.append(counter);
                counter = 1;
            }
        }

        char lastCharacter = message.charAt(message.length() - 1);
        sb.append(lastCharacter);
        sb.append(counter);

        return sb.toString();
    }

    public static void main(String[] args) {
        String message = "aaaabbbccdaa";
        System.out.println(encode(message)); // Output: a4b3c2d1a2
    }
}