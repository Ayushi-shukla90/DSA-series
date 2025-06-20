import java.util.ArrayList;

public class Day17 {
    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        ArrayList<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection: " + intersection);
    }
}
