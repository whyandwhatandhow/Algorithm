package com.ymd.算法.哈希;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class 最大字符 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        LinkedHashSet<Character> list=new LinkedHashSet<>();
        int max=0;
        for (Map.Entry entry:map.entrySet()) {
            max=Math.max(max, (Integer) entry.getValue());
        }

        for (Map.Entry entry:map.entrySet()) {
            if(entry.getValue().equals(max)){
                list.add((Character) entry.getKey());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.toArray()[i]);
        }

    }
}
