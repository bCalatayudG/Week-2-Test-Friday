package com.example.consultants.week_test;

import com.example.consultants.week_test.CustomArrayList.CustomArrayList;
import com.example.consultants.week_test.Queue.Queue;
import com.example.consultants.week_test.linkedList.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        String s = "characters";
        char[] charArray = s.toCharArray();
        LinkedList linkedList = new LinkedList();
        for (char c : charArray) {
            linkedList.add(c);
        }

        linkedList.print();
        System.out.println();

        Queue q = new Queue();

        for (char c : charArray) {
            q.enqueue(c);
        }

        q.dequeue();
        q.dequeue();

        q.print();

        CustomArrayList<String> list = new CustomArrayList<String>();
        list.add("String");
        list.add("fsdrth");

        list.print();

    }

}
