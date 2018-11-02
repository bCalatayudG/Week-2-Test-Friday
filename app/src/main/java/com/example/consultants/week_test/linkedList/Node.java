package com.example.consultants.week_test.linkedList;

public class Node {
    private int head;
    Node next;
    private char data;

    public Node(char data) {
        this.data = data;
        next = null;

    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }
}

