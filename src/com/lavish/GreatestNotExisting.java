package com.lavish;

import java.util.*;
import java.util.stream.Collectors;

public class GreatestNotExisting {


    public static int solution(int[] A) {
        Arrays.sort(A);
        Set<Integer> ints  = new HashSet<>();
        for(int i=0;i<A.length;i++){
            ints.add(A[i]);
        }
        for(int i= 1;i<100000;i++){
            if(!ints.contains(i)){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 3, 6, 4, 1, 2});
        solution(new int[]{1, 2, 3});
        solution(new int[]{-1, -3});
    }
}

