
package Strings;

public class Task5 {
    public static void main(String[] args) {
        implementation_1("application hello hello translate", "hello");
        //implementation_2("application hello hello translate", "hello");
    }

    public static void implementation_1(String text, String word) {
        text = text.replace(word, "*".repeat(word.length()));
        System.out.println("Result: " + text);
    }

    public static void implementation_2(String text, String word) {
        StringBuilder replacement = new StringBuilder("*");
        for (int i = 1; i < word.length(); i++) {
            replacement.append("*");
        }
        text = text.replace(word, replacement);
        System.out.println("Result: " + text);
    }
}