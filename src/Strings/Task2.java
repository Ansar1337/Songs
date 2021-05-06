package Strings;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};
        implementation_1(names);
        //implementation_2(names);
    }

    public static void implementation_1(String[] names) {
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }

    public static void implementation_2(String[] names) {
        for (String name : names) {
            if (name.indexOf("A") == 0) {
                System.out.println(name);
            }
        }
    }
}