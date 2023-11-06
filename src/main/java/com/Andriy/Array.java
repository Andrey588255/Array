package com.Andriy;
import java.util.Arrays;
import java.util.List;
public class Array {
    public int repeatedNumber(final List<Integer> list) {
        if (list.size() <= 1) {
            return -1;
        }

        int[] count = new int[list.size() - 1];

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i) - 1;
            count[n]++;

            if (count[n] > 1) {
                return list.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] s = {3, 8, 15, 17};
        int value = 23;
        ReturnIndex r = new ReturnIndex();
        int[] a = r.twoSum(s, value);
        System.out.println(Arrays.toString(a));
    }
}
