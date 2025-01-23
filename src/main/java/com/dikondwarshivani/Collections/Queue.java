package com.dikondwarshivani.Collections;

import java.util.PriorityQueue;

public class Queue
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("f");
        queue.offer("a");
        queue.offer("v");
        queue.offer("s");
       // System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue.poll());

//        for(String q:queue)
//        {
//            System.out.println(q);
//        }


    }
}
