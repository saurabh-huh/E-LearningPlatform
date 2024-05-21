package training.thread;

import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(13);
        pq.offer(176);
        pq.offer(13545);
        pq.offer(1334);
        pq.offer(13342);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
        System.out.println(pq.size());
    }
}
