package com.lavish;

public class NextGreater {
    public static void main(String[] args) {
        int[] ints = new int[]{70, 15, 10, 16, 20, 8, 9, 7, 50};
        nxtGreater(ints);
    }

    private static void nxtGreater(int[] ints) {
        int next;
        for(int i = 0; i < ints.length; i++){
            next = -1;
            for(int j = i + 1; j < ints.length; j++){
                if(ints[j] > ints[i]){
                    next = ints[j];
                    break;
                }
            }
            System.out.println(ints[i]+"->"+next);
        }
    }
}
