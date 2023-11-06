package com.Andriy;

import java.util.Arrays;

public class ReturnIndex {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int index2 = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index = i;
                    index2 = j;
                }
            }
        }
        int[] list = {index, index2};
        return list;
    }
    public static void main(String[] args) {
        int[] s = {3, 8, 15, 17};
        int value = 23;
        ReturnIndex r = new ReturnIndex();
        int[] a = r.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }
}
