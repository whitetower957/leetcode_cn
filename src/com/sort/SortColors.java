package com.sort;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int flag = 1;
        int left = -1;
        int right = nums.length;
        int i = 0;
        if (nums.length < 2)
            return;
        while (i < right){
            if (nums[i] < flag){
                swap(nums,i++,++left);
            }else if (nums[i] > flag){
                swap(nums,i,--right);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
//        [2,0,2,1,1,0]
        int[] nums = {0,1,2,2,1};
        SortColors sort = new SortColors();
        sort.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
