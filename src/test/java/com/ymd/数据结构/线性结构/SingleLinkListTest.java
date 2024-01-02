package com.ymd.数据结构.线性结构;

import junit.framework.TestCase;

import java.net.InetSocketAddress;

public class SingleLinkListTest extends TestCase {

    public void testAdd() {
        SingleLinkList linkList= new SingleLinkList();
        linkList.add("a");
        linkList.add(1);
        linkList.add(123);
        System.out.println(linkList.toString());
    }

    public void testDelete() {
    }

    public void testTestDelete() {
    }

    public void testUpdate() {
    }

    public void testFindByElement() {
    }

    public void testFindByIndex() {
    }

    public void testTestToString() {
    }
}