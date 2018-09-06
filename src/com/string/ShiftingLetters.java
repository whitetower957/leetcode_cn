package com.string;

public class ShiftingLetters {
    public static String shifting(String S, int[] shifts){
        char[] shiftS = S.toCharArray();
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] num = str.toCharArray();

        for (int i = 1; i < shiftS.length; i++){
            move(shiftS,i,shifts);

        }
        return "";
    }
    public static void move(char[] array, int right,int[] shifts){
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] num = str.toCharArray();
        for (int i = 0; i < right; i++){
            array[i] += shifts[i];
        }

    }
    public static void main(String[] args){
        String S = "abc";
        int[] shifts = {3,5,9};
        shifting(S,shifts);
    }
}
