package com.ymd.数据结构.线性结构;

public class SingleLinkList implements MyList{
    //头节点
    private ListNode head;
    private ListNode last;
    private int size=0;
    @Override
    public void add(Object element) {
        if (head==null){
            head=new ListNode(element);
            last=head;
        }
        else{
            last.next=new ListNode(element);
            last=last.next;
        }
        size++;


    }

    @Override
    public void delete(Object element) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Object newElement) {

    }

    @Override
    public boolean findByElement(Object target) {
        return false;
    }

    @Override
    public Object findByIndex(int index) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");
        ListNode p=head;
        while (p!=null){
            sb.append(p.data).append("->");
            p=p.next;
        }
        sb.append("null]");
        return sb.toString();
    }
}
