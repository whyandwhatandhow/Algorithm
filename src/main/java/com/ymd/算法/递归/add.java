package com.ymd.算法.递归;


// 对数组求和   加参数
public class add {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(f(a,0));
    }

    public static int f(int arr[],int begin){  //添加一个begin参数，用于划界找终点
        if(arr.length-1==begin){
            return arr[begin];
        }

        return arr[begin]+f(arr,begin+1);
    }
}
