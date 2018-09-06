package com.binary;

import java.util.*;

public class IntersetionOfTwoArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        int[] res = nums1.length < nums2.length ? new int[nums1.length] : new int[nums2.length];
        int count = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2])
                p1++;
            else if (nums1[p1] > nums2[p2])
                p2++;
            else {
                res[count++] = nums1[p1];
                p1++;
                p2++;
            }
        }
//        不需要去重
//        int[] res1 = new int[count];
//        for (int i = 0; i < count; i++)
//            res1[i] = res[i];
//        return res1;

//        需要去重
        int[] res1 = new int[count];
        for (int i = 0; i < count; i++)
            res1[i] = res[i];
        res1 = hashRes(res1);
        return res1;

    }
//    去重
    public static int[] hashRes(int[] arr){
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++){
            hash.add(arr[i]);
        }
        int[] res = new int[hash.size()];
        int count = 0;
        Iterator it = hash.iterator();
        while (it.hasNext()){
            res[count++] = (int) it.next();
        }
        return res;
    }
    public static void main(String[] args){
        IntersetionOfTwoArray inter = new IntersetionOfTwoArray();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = inter.intersect(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }
}
