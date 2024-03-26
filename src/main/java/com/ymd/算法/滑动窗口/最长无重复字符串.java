package com.ymd.算法.滑动窗口;

import java.util.HashSet;

public class 最长无重复字符串 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int sum=0;
        int p=-1;
        for (int i = 0; i < s.length(); i++) {
            if(set.size()>0){
                set.remove(s.charAt(i-1));
            }
            while(p+1<s.length()&&!set.contains(s.charAt(p+1))){
                p++;
                set.add(s.charAt(p));
            }

            sum=Math.max(sum,set.size());
        }

        return sum;
    }
}
