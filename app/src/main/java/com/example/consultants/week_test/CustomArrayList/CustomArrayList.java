package com.example.consultants.week_test.CustomArrayList;

public class CustomArrayList<E> {

    Object[] baseArray;
    public static final int DEFAULT_SIZE = 5;
    int size = 0;


    public CustomArrayList() {
        this(DEFAULT_SIZE);
    }

    public CustomArrayList(int size) {
        baseArray = new Object[size];
    }

    public void add(E element) {
        if (size < baseArray.length) {
            return;
        }
        resize();
        baseArray[size++] = element;
    }

    private void resize() {
        Object[] temp = new Object[baseArray.length * 2];
        copy(baseArray, temp);
        baseArray = temp;
    }

    private void copy(Object[] src, Object[] dest){
        for(int i=0;i<src.length; i++){
            dest[i] = src[i];
        }
    }

}
