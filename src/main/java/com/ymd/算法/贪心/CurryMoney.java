package com.ymd.算法.贪心;

import java.util.Scanner;

public class CurryMoney {

    //国王将金币作为工资，发放给忠诚的骑士。第一天，骑士收到枚金币;之后两天(第二天和第三天)，每天收到两枚金币;之后三天(第四、五、六天)，每天收到三枚金币;之后四天(第七、八、九、十天)，每天收到四枚金币......;这种工资发放模式会一直这样延续下去:当连续天每天收到N金币后骑士会在之后的连续N+1天里，每天收到N+1金币
    //请计算在前K天里，骑士一共获得了多少金币。


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        int money=0;
        int flag=1;
        int curry=flag;
        for (int i = 0; i < day; i++) {
            money+=flag;
            curry--;

            if(curry==0){
                flag++;
                curry=flag;
            }
        }

        System.out.println(money);
    }
}
