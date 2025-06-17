import java.util.Arrays;

public class Day5 {
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] < 0) {
                left++;
            }
            while (right > left && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -3, -45, 7, -89, 23, -1, 56};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
