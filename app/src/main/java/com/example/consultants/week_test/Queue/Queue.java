package com.example.consultants.week_test.Queue;

import java.util.Stack;

public class Queue {
    Stack<Character> stacks = new Stack<>();
    Stack<Character> invertedStack = new Stack<>();

    public void enqueue (char c){
        stacks.push(c);
    }

    public void dequeue(){
        Stack<Character> temp = new Stack<>();
        temp = reverse(stacks,invertedStack);
        stacks = new Stack<>();
        invertedStack = new Stack<>();
        temp.pop();
        int size = temp.size();
        for(int i=0; i<size;i++){
            stacks.push(temp.pop());
        }
    }

    private Stack<Character> reverse(Stack<Character> originalStak, Stack<Character> reverseStak){
        int size = originalStak.size();
        for(int i=0; i<size;i++){
            reverseStak.push(originalStak.pop());
    }
        return reverseStak;
    }

    public void print(){
        for (char c:stacks) {
            System.out.println("Char: "+c);
        }
    }
}
