package com.ymd.算法;
//判断整数是不是2的整数次方
public class judgeIntegerOf2 {
    public static void main(String[] args) {
        //从2进制角度考虑  和上面题目一样用减法！！！！
        int num=6;
        int count=0;
        while(num!=0){
            if(((num-1)&num)==0){              // 0100 -> 0011
                count=1;
                break;
            }else {
                break;
            }
        }
        if (count==1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
