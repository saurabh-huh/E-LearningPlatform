package training.day3;

import javax.naming.InsufficientResourcesException;
import java.util.*;

public class AppropriateCollection {
    public static void main(String[] args) {
        //Use of map
        //having (key,value) ->  if it needs for the sorted key then use TreeMap otherwise use HashMap
        //if it needs the traversal according to insert value for the map than use linkedHashMap.

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<5;i++)
            map.put(i,i*3);

        System.out.println(map);
        // use of set
        // when no duplicate is allowed if it needs to maintain the order of insertion use linkedHashSet
        // else use HashSet

        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();

        set.add(78);
        set.add(7);
        set.add(18);
        set.add(8);
        set.add(28);
        set.add(78);

        System.out.println(set);
        linkedSet.add(23);
        linkedSet.add(3);
        linkedSet.add(32);
        linkedSet.add(42);
        linkedSet.add(24);
        linkedSet.add(23);

        System.out.println(linkedSet);

        //use of Queue
        //when it needs FIFO than use Queue collection
        //when it needs value according to the priority use priorityQueue
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        queue.addAll(set);
        pq.addAll(set);
        System.out.println(queue.remove());
        System.out.println(pq.remove());


        //use of list and linkedList
        //both maintain the order of insert value
        //linkedList takes 0(1) for insert and remove element in start
        //list takes the 0(n) for the same.
        List<Integer> list = new ArrayList<>(set);
        List<Integer> linkedList = new LinkedList<>(set);

        linkedList.add(0,12); //  0(1) time complexity needed
        System.out.println(linkedList.get(0));

        list.add(0,56); //0(n) time complexity needed
        System.out.println(list .get(0));
    }

}
