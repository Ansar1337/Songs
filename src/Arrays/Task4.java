package Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 7, -3, 9, -11, 18, 99, 2, 11, 12, 13};
        implementation_1(array);
    }

    public static void implementation_1(int[] array) {
        System.out.println("Current array: " + Arrays.toString(array));
        System.out.print("Last three elements of an array:");
        for (int i = array.length - 3; i < array.length; i++) {
            System.out.print(" " + array[i]);
            if (i < array.length - 1) {
                System.out.print(',');
            }
        }
    }
}