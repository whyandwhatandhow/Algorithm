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


第一周欠下的：
https://www.lanqiao.cn/problems/1461/learning/
https://www.lanqiao.cn/problems/2107/learning/  _1
https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnhhkv/
https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2f9gg/



查找字符串重复的字符
一个从前查找，一个从后查找，如果下标相等，说明只出现了一次  使用api
```
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        return -1;
    }
```

获取前缀：
```
public String longestCommonPrefix(String[] strs) {
String ans = strs[0];
for (int i = 1; i < strs.length; ++i) {
while (strs[i].indexOf(ans) != 0)
ans = ans.substring(0, ans.length() - 1);
}
return ans;
}
```



第二周欠下的：
https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnoilh/
https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnpvdm/
https://www.lanqiao.cn/problems/287/learning/
https://www.lanqiao.cn/problems/523/learning/






第三周欠下的：
https://www.lanqiao.cn/problems/3497/learning/ --DFS（困难）
