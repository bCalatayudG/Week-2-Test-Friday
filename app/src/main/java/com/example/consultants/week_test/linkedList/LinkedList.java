package com.example.consultants.week_test.linkedList;

public class LinkedList {

    Node head = null;
    Node tail;
    Node pivot;
    int position=0;

    public void add(char character){
        Node node = new Node(character);
        if (head == null) {
            head = node;
            head.setHead(position);
            pivot = head;
        }else{
            tail = node;
            tail.setHead(position);
            pivot.setNext(tail);
            pivot = tail;
        }

        position++;
    }

    public void print()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.getData()+" ");
            n = n.next;
        }
    }


}
