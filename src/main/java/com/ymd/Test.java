package com.ymd;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb=new StringBuilder();
        int n=x;
        while (n>0){
            sb.append(n%10);
            n=n/10;
        }
        int result=Integer.parseInt(String.valueOf(sb));
        if(result==x){
            return true;
        }else return false;
    }

}
