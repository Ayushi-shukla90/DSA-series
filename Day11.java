import java.util.Arrays;

public class   Day11 {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int posIndex = 0, negIndex = 1;

        for (int num : arr) {
            if (num >= 0 && posIndex < n) {
                result[posIndex] = num;
                posIndex += 2;
            } else if (num < 0 && negIndex < n) {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
