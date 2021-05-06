package Arrays;

import java.util.Arrays;

//Displaying only even numbers
public class Task5 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        implementation_1(array);
    }

    public static void implementation_1(int[] array) {
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.print("Even numbers:");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
            }
        }
    }
}