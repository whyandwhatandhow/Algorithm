package com.ymd.数据结构.线性结构;
//定义接口
public interface MyList {
    void add(Object element);
    void delete(Object element);
    void delete(int index);
    void update(int index,Object newElement);
    boolean findByElement(Object target);
    Object findByIndex(int index);
}
