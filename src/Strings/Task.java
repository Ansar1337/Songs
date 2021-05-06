package Strings;

import java.lang.*;

public class Task {
    public static void main(String[] args) {
        implementation_1("application hello transaction template", "hello");
        //implementation_2("application hello transaction template", "hello");
    }

    public static void implementation_1(String text, String word) {
        if (text.contains(word)) {
            System.out.println("The word '" + word + "' is in the String 'text'");
        } else {
            System.out.println("The word '" + word + "' is not in the String 'text'");
        }
    }

    public static void implementation_2(String text, String word) {
        if (text.indexOf(word) != -1) {
            System.out.println("The word '" + word + "' is in the String 'text'");
        } else {
            System.out.println("The word '" + word + "' is not in the String 'text'");
        }
    }
}