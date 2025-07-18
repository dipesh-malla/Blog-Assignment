import java.util.HashSet;
import java.util.Set;

public class ArrayPair {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 4, 3};
        int target = 5;

        Set<Integer> seen = new HashSet<>();
        Set<String> printedPairs = new HashSet<>();
        boolean found = false;

        for (int num : nums) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String pairKey = a + "," + b;
                if (!printedPairs.contains(pairKey)) {
                    System.out.println("Pair found (" + a + ", " + b + ")");
                    printedPairs.add(pairKey);
                    found = true;
                }
            }

            seen.add(num);
        }

        if (!found) {
            System.out.println("Pair not found.");
        }
    }
}
