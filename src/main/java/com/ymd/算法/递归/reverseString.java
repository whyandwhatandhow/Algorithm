package com.ymd.算法.递归;

public class reverseString {
    public static void main(String[] args) {
        String c="abcde";
        String s=reverse(c,4);
        System.out.println(s);
    }

    public static String reverse(String src,int end){
        if(end==0){
            return ""+src.charAt(0);
        }
        return src.charAt(end)+reverse(src,end-1);
    }


}
