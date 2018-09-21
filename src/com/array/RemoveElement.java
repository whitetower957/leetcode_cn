package com.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right){
            if (nums[left] == val){
                swap(nums,left,--right);
            }else
                left++;
        }
        return right;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,4,0};
        int n = removeElement.removeElement(nums,0);
        System.out.println(n);
    }
}
