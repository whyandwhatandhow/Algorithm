package com.ymd.数据结构.线性结构;


import java.util.Arrays;

//顺序表
public class ArrayListStruck implements MyList{

    private Object[] elements;
    private int size=0;//目前容量
    private int capacity=10;//最大容量

    public ArrayListStruck() {
        elements=new Object[capacity];
    }


    //用户定义输入容量
    public ArrayListStruck(int capacity) {
        this.capacity = capacity;
        elements=new Object[capacity];
    }

    @Override
    public void add(Object element) {
        if(size==capacity){
            System.out.println("越界");
            System.exit(0);
        }
        elements[size]=element;
        size++;
    }

    @Override
    public void delete(Object element) {
        for (int i = 0; i < size; i++) {
            if(element.equals(elements[i])){
                elements[i]=null;
            }
            size--;
        }

    }

    @Override
    public void delete(int index) {
        elements[index]=null;
        size--;
    }

    @Override
    public void update(int index, Object newElement) {
        elements[index]=newElement;
    }

    @Override
    public boolean findByElement(Object target) {
        return false;
    }

    @Override
    public Object findByIndex(int index) {
        return elements[index];
    }


    @Override
    public String toString() {
        return "ArrayListStruck{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
