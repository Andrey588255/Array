package com.Andriy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class Duplicates {
        public static Set<Integer> findDuplicates(int[] arr) {
            Set<Integer> seen = new HashSet<>();
            return Arrays.stream(arr).filter(i -> !seen.add(i))
                    .boxed().collect(Collectors.toSet());
        }

        public static void main(String[] args) {
            int[] values = {4,5,6,6,8};

            Set<Integer> duplicates = findDuplicates(values);
            System.out.println(duplicates);
        }
    }
