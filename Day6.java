import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            if (unionSet.contains(num)) {
                intersectionSet.add(num);
            }
            unionSet.add(num);
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
