import java.util.*;

public class Day13 {
    public static void findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10, 30};
        int target = 50;
        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}
