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


        //右移num
        int count2=0;
        for (int i = 0; i < 32; i++) {
            if(((num>>i)&1)==1){
                count2++;
            }
        }
        System.out.println(count2);



        //解法3---减法
        int count3=0;
        while (num!=0){
            num=(num-1)&num;
            count3++;
        }
        System.out.println(count3);


    }
}
