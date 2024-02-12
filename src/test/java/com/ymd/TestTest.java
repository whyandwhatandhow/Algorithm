package com.ymd;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
import java.time.LocalDate;
import junit.framework.TestCase;
import org.junit.Test;

public class TestTest {


    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1;i<2023 ; i++) {
            if (check(i, 2) && check(i, 8) && check(i, 10) && check(i, 16)) cnt++;
        }

        System.out.println(cnt);

    }

    //判断是否为mod进制下的哈沙德数
    public static boolean check(int x, int mod) {
        int n = x;
        int ans = 0;
        while (x > 0) {
            ans = ans + x % mod;
            x /= mod;
        }
        return n % ans == 0;
    }
}


