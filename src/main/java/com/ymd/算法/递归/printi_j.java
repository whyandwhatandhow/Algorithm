package com.ymd.算法.递归;


//打印从i到j
public class printi_j {
    public static void main(String[] args) {
        printIJ(1,10);
    }

    public static void printIJ(int i,int j){
        if(i>j){
            return;
        }
        System.out.println(i);
        printIJ(i+1,j);
    }
}
