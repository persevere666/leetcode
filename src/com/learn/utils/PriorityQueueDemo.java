package com.learn.utils;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(3);
        minHeap.add(0);
        minHeap.add(0);
        System.out.println(minHeap.toString());
        minHeap.remove(0);
        System.out.println(minHeap.toString());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            new Comparator<Integer>() {
                public int compare(Integer a, Integer b){
                    return b.compareTo(a);
                }
            }
        );
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(-1);
        System.out.println(maxHeap.toString());
        
    }
}
