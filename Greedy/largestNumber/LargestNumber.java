package Greedy.largestNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder("");

        List<Integer> array = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(array, new NumberComparator());

        for (int num : array) {
            result.append(Integer.toString(num));
        }

        if (result.charAt(0) == '0') {
            return "0";
        }
        return result.toString();
    }
}
