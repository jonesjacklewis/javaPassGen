import java.util.ArrayList;

public class myString {
    public String uppercase() {
        StringBuilder answer = new StringBuilder();
        char c;
        for (c = 'A'; c <= 'Z'; c++) {
            answer.append(c);
        }
        return answer.toString();
    }

    public String lowercase() {
        StringBuilder answer = new StringBuilder();
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            answer.append(c);
        }
        return answer.toString();
    }

    public String numbers() {
        StringBuilder answer = new StringBuilder();
        int i;
        for (i = 0; i < 9; i++) {
            answer.append(i);
        }
        return answer.toString();
    }

    public String punctuation() {
        String answer = "!\"" + "]$%&'" + "()*+,-./:;<=>?@[\\" + "]^_'{|}~";
        return answer;

    }

    public ArrayList<String> stringToArrayList(String word) {
        ArrayList<String> answer = new ArrayList<>();
        for (char c : word.toCharArray()) {
            answer.add(Character.toString(c));
        }
        return answer;
    }
}
