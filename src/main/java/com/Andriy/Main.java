package com.Andriy;
import java.util.HashSet;
import java.util.Set;
public class Main {
        public static Set<Integer> findDuplicates(int[] arr) {
            Set<Integer> seen = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();
            for (int i: arr) {
                if (!seen.add(i)) {
                    duplicates.add(i);
                }
            }
            return duplicates;
        }
        public static void main(String[] args) {
            int[] values = {5, 3, 2, 3, 1, 4, 5};

            Set<Integer> duplicates = findDuplicates(values);
            System.out.println(duplicates);
        }
    }

