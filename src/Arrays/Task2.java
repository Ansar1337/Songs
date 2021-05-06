package Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        implementation_1(array);
    }

    public static void implementation_1(int[] array) {
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("The second half of an array:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(" " + array[i]);
            if (i < array.length - 1) {
                System.out.print(',');
            }
        }
    }
}