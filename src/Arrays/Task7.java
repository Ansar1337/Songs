package Arrays;

//Minimum and maximum element in an array
public class Task7 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        int min = 0;
        int max = 0;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}