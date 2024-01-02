package com.ymd.算法.位运算和二进制;


// 给定一个浮点数（0.625）->(0.101)

//0.625x2=1.25 ---1 |
//0.25x2=0.5   ---0 |
//0.5x2=1      ---1 v
//0.101

public class floatBinary {
    //用String拼接
    public static void main(String[] args) {
        double num=0.3;
        StringBuilder sb=new StringBuilder("0.");
        while(num>0){
            double r=num*2;
            if(r>=1){
                sb.append("1");
                num=r-1;
            }
            else {
                sb.append("0");
                num=r;
            }

            if(sb.length()>34){
                System.out.println("ERROR");
                return;
            }

        }

        System.out.println(sb.toString());
    }
}
