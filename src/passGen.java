import java.security.SecureRandom;
import java.util.ArrayList;

public class passGen {
    public static String generator(int length) {
        myString string = new myString();
        SecureRandom secureRandom = new SecureRandom();

        String allChars = string.uppercase() + string.lowercase() + string.numbers() + string.punctuation();
        ArrayList<String> possibleChars = string.stringToArrayList(allChars);
        int maxLength = possibleChars.size();
        StringBuilder password = new StringBuilder();


        while (length > 0) {
            int randomIndex = secureRandom.nextInt(maxLength);
            password.append(possibleChars.get(randomIndex));
            length--;
        }

        System.out.println(password.toString());
        return password.toString();
    }

    public static String generator() {
        int length = 10;
        myString string = new myString();
        SecureRandom secureRandom = new SecureRandom();

        String allChars = string.uppercase() + string.lowercase() + string.numbers() + string.punctuation();
        ArrayList<String> possibleChars = string.stringToArrayList(allChars);
        int maxLength = possibleChars.size();
        StringBuilder password = new StringBuilder();


        while (length > 0) {
            int randomIndex = secureRandom.nextInt(maxLength);
            password.append(possibleChars.get(randomIndex));
            length--;
        }

        System.out.println(password.toString());
        return password.toString();
    }
}
