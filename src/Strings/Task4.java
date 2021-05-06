package Strings;

public class Task4 {
    public static void main(String[] args) {
        implementation_1("application hello hello translate", "hello");
    }

    public static void implementation_1(String text, String word) {
        int count = 0;
        for (int p = text.indexOf(word); p != -1; p = text.indexOf(word, p + word.length())) {
            count++;
        }
        System.out.println("Number of String word `" + word + "` in String 'text': " + count);
    }
}