public class Day14 {
    public static void findSubarray(int[] arr, int target) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with given sum found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        findSubarray(arr, target);
    }
}
