# Algorithm
学习算法和数据结构的实践

```
 public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.println((1<<i));
        }
    }
    
    通过这个找二进制
    
1
2
4
8
16
32
64
128
256
512
1024
2048
4096
8192
16384
32768
65536
131072
262144
524288
1048576
2097152
4194304
8388608
16777216
33554432
67108864
134217728
268435456
536870912
1073741824
```

在Java中，>>>（无符号右移）和>>（有符号右移）是位运算符，用于对整数进行右移操作。它们之间的主要区别在于对待符号位的方式。

>>（有符号右移）：

对于正数，>> 和 >>> 的效果是一样的，都是将每一位都右移，高位用原先的最高位填充。
对于负数，>> 会在左侧插入1，以保持符号一致。即，负数右移后，最高位仍然是1，因此符号不会改变。
java
Copy code
int num = -16;
int result = num >> 2;  // 结果是 -4
>>>（无符号右移）：

对于正数，>>> 和 >> 的效果也是一样的，都是将每一位都右移，高位用零填充。
对于负数，>>> 不再在左侧插入1，而是用0填充。这意味着负数右移后，最高位变为0，因此结果是正数。
java
Copy code
int num = -16;
int result = num >>> 2;  // 结果是 1073741820
