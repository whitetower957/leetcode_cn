package com.sort;

import java.util.Arrays;

public class Merge {
    public void mmerge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int[] arr = new int[m + n];
        while (p1 < m && p2 < n){
            arr[i++] = nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        }
        while (p1 < m){
            arr[i++] = nums1[p1++];
        }
        while (p2 < n){
            arr[i++] = nums2[p2++];
        }
        for (i = 0; i < arr.length; i++){
            nums1[i] = arr[i];
        }
    }
    public static void main(String[] args){
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Merge merge = new Merge();
        merge.mmerge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
