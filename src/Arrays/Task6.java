package Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        implementation_1(array);
    }

    public static void implementation_1(int[] array) {
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("Elements that are greater than previous ones:");
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(" " + array[i]);
                if (i < array.length - 1) {
                    System.out.print(',');
                }
            }
        }
    }
}