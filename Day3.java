import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 7, 89, 23, 1, 56};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(k + "th minimum element: " + arr[k - 1]);
        System.out.println(k + "th maximum element: " + arr[arr.length - k]);
    }
}
