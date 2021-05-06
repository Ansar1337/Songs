package Strings;

public class Task3 {
    public static void main(String[] args) {
        implementation_1("application hello hello translate");
        //implementation_2("application hello hello translate");
    }

    public static void implementation_1(String text) {
        int firstSpacePos = text.indexOf(' ');
        String firstWord = text.substring(0, firstSpacePos);
        System.out.println("The first word: " + firstWord);

        int lastSpacePos = text.lastIndexOf(' ');
        String lastWord = text.substring(lastSpacePos + 1);
        System.out.println("The last word: " + lastWord);
    }

    public static void implementation_2(String text) {
        String firstWord = null;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                firstWord = text.substring(0, i);
                break;
            }
        }
        System.out.println("The first word: " + firstWord);

        String lastWord = null;
        for (int i = text.length() - 1; i > 0; i--) {
            if (text.charAt(i) == ' ') {
                lastWord = text.substring(i + 1);
                break;
            }
        }
        System.out.println("The last word: " + lastWord);
    }
}