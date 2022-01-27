package com.example.employee.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Demoblockingqueue {
    public static void main(String[] a){
        //LinkedBlockingQueue, ArrayBlockingQueue, PriorityBlockingQueue, SynchronousQueue
        //ArrayBlockingQueue(int capacity): Creates an ArrayBlockingQueue with the given (fixed) capacity and default access policy.
        //
        //BlockingQueue<Integer> queue = new ArrayBlockingQueue<>();

        //
        BlockingQueue<Integer> abq = new LinkedBlockingQueue<>();

        // add  numbers
        abq.add(1);
        abq.add(2);
        abq.add(3);

        // print queue
        System.out.println("ArrayBlockingQueue:" + abq);

        // remove 223
        boolean response = abq.remove(2);

        // print Queue
        System.out.println("Removal of 2 :" + response);

        // print Queue
        System.out.println("queue contains " + abq);


        //The peek() method provided by the Queue interface is used to return the head of the queue.
        // It retrieves but does not remove, the head of this queue.
        // If the queue is empty then this method returns null.
        System.out.println("Head of queue " + abq.peek());

        // remove all the elements
        abq.clear();

        // print queue
        System.out.println("ArrayBlockingQueue:" + abq);

        // very important concept for blocking queue
        // add and remove operations throws exception while full or empty
        // put and take operations will be block not throw any exception

        //Summary of BlockingQueue methods
        //Throws exception	Special value	Blocks	Times out
        //Insert	add(e)	offer(e)	put(e)	offer(e, time, unit)
        //Remove	remove()	poll()	take()	poll(time, unit)
        //Examine	element()	peek()	not applicable	not applicable

    }
}
