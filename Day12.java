public class Day12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 4};
        int target = 2; 
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " occurs " + count + " times in the array.");
    }
}
