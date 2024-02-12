package com.ymd;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String op= scanner.nextLine();
        int startIndex=op.indexOf("IN");
        int endIndex=op.length()-1;
        if(startIndex!=-1){
            String re=op.substring(startIndex+3,endIndex-1);
            System.out.println(re);
        }
    }
}
