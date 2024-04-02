package com.ymd.算法;

import java.math.BigInteger;

public class 大数阶乘 {
    public static void main(String[] args) {
        String s="77";
        BigInteger bigInteger= BigInteger.ZERO;
        for (int i = 1; i < 66; i++) {
            bigInteger=bigInteger.add(fab(BigInteger.valueOf(i)));
        }
        System.out.println(bigInteger);
        System.out.println(420940313);
    }

    public static BigInteger fab(BigInteger bigInteger) {
        if (bigInteger.equals(BigInteger.ZERO) || bigInteger.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return bigInteger.multiply(fab(bigInteger.subtract(BigInteger.ONE)));
    }

}
