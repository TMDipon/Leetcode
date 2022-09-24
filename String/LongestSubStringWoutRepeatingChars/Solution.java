package String.LongestSubStringWoutRepeatingChars;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0, maxLength = 0;
        for (int j = 0; j < s.length(); ++j) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), j);
            } else {
                int temp = map.get(s.charAt(j));
                for (int k = i; k <= temp; ++k) {
                    map.remove(s.charAt(k));
                }

                i = temp + 1;
                map.put(s.charAt(j), j);
            }

            maxLength = Math.max(j - i + 1, maxLength);
        }

        return maxLength;
    }
}
