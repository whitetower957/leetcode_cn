package com.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void move(int[] nums) {
        int numsLen = nums.length -1;
        int count = 0;      //非0的个数，-1则是最后需要调整的次数

        for(int i = 0; i < numsLen; i++){
            if (nums[i] == 0){
                while (nums[numsLen] == 0){
                    numsLen--;
                }
                swap(nums,i,numsLen);
                numsLen--;
            }
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < count -1 ; i++){
            swap(nums,i,i+1);
        }
    }
    public static void swap(int[] nums,int index,int numsLen){
        int temp = nums[index];
        nums[index] = nums[numsLen];
        nums[numsLen] = temp;
    }
    public static void main(String[] args){
//        [0,1,0,3,12]
//          12 1 3 0 0

//      如果为0，则和它的下一个数交换
        int[] nums = {1,0,2,3,1,0};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
