package com.ymd.算法;
//找出二进制中1的个数
public class findBinaryOf1 {
    public static void main(String[] args) {
        int num=9;//找出num二进制的1 的个数
        System.out.println(Integer.toBinaryString(num));

        //用位运算的方法
//        int 最多是32位
        int count=0;
        for (int i = 0; i < 32; i++) {
            if((num&(1<<i))==(1<<i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
