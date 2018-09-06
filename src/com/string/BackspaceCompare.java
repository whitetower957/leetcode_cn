package com.string;

import java.util.ArrayList;

public class BackspaceCompare {
    public static void main(String[] args){
        boolean flag = sta("as#c","bs#c");
        System.out.println(flag);
    }
    public static boolean sta(String S,String T){
        boolean flag = true;

        ArrayList<Character> news = bijiao(S.toCharArray());
        ArrayList<Character> newt = bijiao(T.toCharArray());

        if (news.size()!= newt.size())
            flag = false;
        else {
            for (int i = 0; i < news.size(); i++){
                if (news.get(i) != newt.get(i))
                    flag = false;
            }
        }
        return flag;
    }
    public static ArrayList<Character> bijiao(char[] chars){
        ArrayList<Character> news = new ArrayList<Character>();
        for (int i = chars.length - 1; i >0;i--){
            if (chars[i] == '#'){
                chars[i] = 0;
                chars[i - 1] = 0;
            }
            if (chars[i] != 0){
                news.add(chars[i]);
            }
        }
        if (chars[0] != 0)
            news.add(chars[0]);
        return news;
    }
}
