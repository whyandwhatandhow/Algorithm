package com.ymd.数据结构.线性结构;

import java.util.Scanner;

public class 单链表移动 {
    public static class Node{
        int date;
        Node next;

        public Node(int date){
            this.date=date;
        }

        public Node(){}
    }

    public static Node InitNode(Node head){
        head=new Node();
        head.next=null;
        return head;
    }

    public static Node NodeChangeNode(Node head,int num){
        if(head==null||head.next==null){
            return null;
        }

        Node pre=head;
        Node cue=head.next;
        Node a=head.next;
        while(cue!=null&&cue.date!=num){
            pre=pre.next;
            cue=pre.next;
        }

        if(cue!=null){
            pre.next=cue.next;
            cue.next=a;
            head.next=cue;
        }


        return head;
    }

    public static void PrintNode(Node head){
        if(head==null){
            return;
        }
        Node a=head.next;
        while(a!=null){
            System.out.print(a.date+" ");
            a=a.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Node head = null;
        head=InitNode(head);
        int data=1;
        Node cue=head;
        for (int i = 0; i < 10; i++) {
            Node node=new Node(data);
            data++;
            cue.next=node;
            cue=node;
            node.next=null;
        }

        int length=scanner.nextInt();
        for (int i = 0; i < length; i++) {
            int temp=scanner.nextInt();
            head=NodeChangeNode(head,temp);
            PrintNode(head);
        }


    }
}
