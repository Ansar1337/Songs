package Arrays;


import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        implementation_1(array);
    }

    public static void implementation_1(int[] array) {
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("The first 3 elements of an array:");
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.print(" " + array[i]);
            if (i < count - 1) {
                System.out.print(',');
            }
        }
    }
}