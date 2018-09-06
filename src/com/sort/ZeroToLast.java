package com.sort;

import java.util.Arrays;

public class ZeroToLast {
    public static void zero(int[] array){
        int last = array.length - 1;
        for (int i = 0; i < last + 1; ){
            if (array[i] == 0){
                for (int j = i; j < last; j++){
                    array[j] = array[j + 1];
                }
                array[last--] = 0;
            }else
                i++;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,0};
        zero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
