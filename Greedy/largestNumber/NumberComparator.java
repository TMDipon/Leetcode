package Greedy.largestNumber;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        String num1 = Integer.toString(o1);
        String num2 = Integer.toString(o2);

        StringBuilder a = new StringBuilder(num1 + num2);
        StringBuilder b = new StringBuilder(num2 + num1);

        for (int i=0; i< a.length(); ++i) {
            int a1 = Integer.valueOf(a.charAt(i));
            int b1 = Integer.valueOf(b.charAt(i));

            if (a1 > b1) {
                return -1;
            } else if (b1 > a1) {
                return 1;
            }
        }
        return -1;
    }
}
