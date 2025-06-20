import java.util.Arrays;

public class Day19 {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < n + m) {
    
                int a = (i < n) ? arr1[i] : arr2[i - n];
                int b = (j < n) ? arr1[j] : arr2[j - n];

                if (a > b) {
        
                    if (i < n && j < n) {
                        int temp = arr1[i]; arr1[i] = arr1[j]; arr1[j] = temp;
                    } else if (i < n) {
                        int temp = arr1[i]; arr1[i] = arr2[j - n]; arr2[j - n] = temp;
                    } else {
                        int temp = arr2[i - n]; arr2[i - n] = arr2[j - n]; arr2[j - n] = temp;
                    }
                }

                i++; j++;
            }

            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};

        merge(arr1, arr2);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
