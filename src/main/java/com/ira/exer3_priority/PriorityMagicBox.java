package com.ira.exer3_priority;


import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by iryna.sribna on 02.03.2015.
 */
public class PriorityMagicBox {


    public static void main(String[] args) {
        List<MagicBoxWithPriority> magicBoxes = new LinkedList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        MagicBoxWithPriority magicbox1 = new MagicBoxWithPriority();
        magicbox1.setPriority(3);

        MagicBoxWithPriority magicbox2 = new MagicBoxWithPriority();
        magicbox2.setPriority(1);

        MagicBoxWithPriority magicbox3 = new MagicBoxWithPriority();
        magicbox3.setPriority(5);

        magicBoxes.add(magicbox1);
        magicBoxes.add(magicbox2);
        magicBoxes.add(magicbox3);

        queue.add(magicbox1.getPriority());
        queue.add(magicbox2.getPriority());
        queue.add(magicbox3.getPriority());

        System.out.println("Priority queue with null comparator " + queue);

        PriorityQueue<MagicBoxWithPriority> priorityQueue = new PriorityQueue<>(magicBoxes.size(), new PriorityComparator());
        priorityQueue.add(magicbox1);
        priorityQueue.add(magicbox3);
        priorityQueue.add(magicbox2);
        priorityQueue.add(magicbox3);


        System.out.println("Priority queue with Comparator: " + priorityQueue);

        //process of magic boxes
        while(priorityQueue.size() != 0) {
            System.out.println(priorityQueue.remove());
        }
    }


}
