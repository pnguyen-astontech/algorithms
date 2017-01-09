package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by petenguy1 on 12/9/2016.
 */
public class Heap {

    private int size;
    private int child;
    private int parent;
    private String type;
    private List<Integer> heapList;

    public Heap() {
        this.type = "MAX";
    }

    public Heap(String type) {
        this.type = type;
        this.size = 0;
        this.heapList = new ArrayList<>();
    }

    public void put(int number) {
        this.heapList.add(number);
        this.size++;
        this.child = this.size-1;
        this.parent = (this.size-1)/2;
        sortHeap();
    }

    public void setType(String type) {
        this.type = type;
    }

    public int peekRoot() {
        return this.heapList.get(0);
    }

    public int popRoot() {
        this.size--;
        return this.heapList.remove(0);
    }

    public int getSize() {
        return this.size;
    }

    private void sortHeap() {
        if ((this.heapList.get(this.child) > this.heapList.get(this.parent) && this.type.equals("MAX"))
                || (this.heapList.get(this.child) < this.heapList.get(this.parent) && this.type.equals("MIN"))) {
            Collections.swap(this.heapList, this.child, this.parent);
            this.child = this.parent;
            this.parent = (this.child-1)/2;
            sortHeap();
        }
    }
}
