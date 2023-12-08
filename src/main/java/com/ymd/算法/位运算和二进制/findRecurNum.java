package com.ymd.算法.位运算和二进制;


import java.util.Arrays;
import java.util.Random;

//1-1000这1000个数放在含1001个元素的数组中，只有唯一的一个元素重复，其他均只重复一次。
//每个数组只访问一次，设计一个算法，找出这个元素，不开辟新的空间
public class findRecurNum {
    public static void main(String[] args) {
        //1.创建一个这样的数组
        int N=1001;
        int[] arr=new int[N];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=i+1;
        }
        arr[arr.length-1]=new Random().nextInt(N-1)+1;
        int index=new Random().nextInt(N);
        swap(arr,index,arr.length-1);
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("============================");
        //方法1 用位运算找出重复的
        int x1 = 0;
        for (int i = 1; i <= N-1; i++) {  // 注意这里是 <= N，而不是 < N-1
            x1 = (x1 ^ i);
        }
        for (int i = 0; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
        }
        System.out.println(x1);



        System.out.println();
        System.out.println("============================");
        //暴力2  用数组的值作为数组的下标
        int help[]=new int[N];
        for (int i = 0; i < N; i++) {
            help[arr[i]]++;
        }
        for (int i = 0; i < N; i++) {
            if(help[i]==2){
                System.out.println(i);   //注意这里是i的值，不是arr[i]的值
            }
        }

        System.out.println();
        System.out.println("============================");

        //暴力运算
       Arrays.sort(arr);
        System.out.println();
        int result=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                result=arr[i];
                break;
            }
            else result=arr[arr.length-1];
        }
        System.out.println(result);

    }


    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("索引超出数组范围，无法交换。");
            return;
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

