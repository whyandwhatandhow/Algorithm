package com.ymd.算法.位运算和二进制;
//将整数的奇偶位互换   1001->0110
public class change0And1 {
    public static void main(String[] args) {
        int num1=9;
        int num2=change(num1);
        System.out.println(num2);
        System.out.println(Integer.toBinaryString(0xaaaaaaaa));
        System.out.println(Integer.toBinaryString(0x55555555));
    }

    public static int change(int num){
        int ou=num&0xaaaaaaaa; //偶数位 101010.。。x32  -->0001000  得到所有在奇数位的数
        int ji=num&0x55555555;  //奇数位 010101....x32 -->0000001
        int result=(ou>>1)^(ji<<1);
        return result;
    }

}
