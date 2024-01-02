package com.ymd.算法.位运算和二进制;


import java.util.Arrays;

//数组中一个元素只出现一次，其他的都出现了k次，找出这元素

public class findSingleNumPro {
    public static void main(String[] args) {
        int arr[]={2,2,6,7,8,9,7,8,9,2,7,8,9};   //都出现了3次

        //暴力解法1  但是注意其他的是都出现了k次
        int help[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            help[arr[i]]++;
        }
        for (int i = 0; i < help.length; i++) {
            if(help[i]==1){
                System.out.println(i);
            }
        }

        //进制法  ---> k进制不进位累加k次都是0    在10进制中6累加60十次，后面是0
        //例子中都出现了3次
        int len=arr.length;
        char[][]kRadix=new char[len][];
        int maxLen=0;//记录转为k进制之后的最大长度





    }
}
