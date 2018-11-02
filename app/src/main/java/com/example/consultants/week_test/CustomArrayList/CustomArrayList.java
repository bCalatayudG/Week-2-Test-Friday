package com.example.consultants.week_test.CustomArrayList;

public class CustomArrayList<E> {

    Object[] baseArray;
    public static final int FIXED_VALUE = 5;
    int size = 0;


    public CustomArrayList() {
        this(FIXED_VALUE);
    }

    public CustomArrayList(int size) {
        baseArray = new Object[size];
    }

    public void add(E element) {
        spaceInTheArray();
        baseArray[size] = element;
        size = size + 1;
    }

    private void spaceInTheArray() {
        if (size < baseArray.length) {
            return;
        }
        Object[] temp = new Object[baseArray.length * 2];
        for (int i = 0; i < baseArray.length; i++) {
            temp[i] = baseArray[i];
        }
        baseArray = temp;
    }

    public void print() {
        for (Object element : baseArray) {
            if (element != null)
                System.out.println(element);
        }
    }

}
