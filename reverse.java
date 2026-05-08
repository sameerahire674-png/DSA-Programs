import java.util.Arrays;

public class reverse {
    public static void reverseno(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Step 1: Swap elements using a temporary variable
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Step 2: Move pointers toward the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        
        System.out.println("Original: " + Arrays.toString(data));
        
        reverseno(data);
        
        System.out.println("Reversed: " + Arrays.toString(data));
    }
}