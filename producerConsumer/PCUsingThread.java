package training.producerConsumer;

import java.util.LinkedList;
import java.util.List;

public class PCUsingThread {
    public static void main(String[] args) {
       final PC pc = new PC();
        Producer producer = new Producer();
        producer.run();
        Consumer consumer = new Consumer();
        consumer.run();
    }
}
class PC{
    List<Integer> list = new LinkedList<>();
    int capacity = 2;
    public void produce() throws InterruptedException {
        int value =0 ;
        while(true){
            synchronized (this){
                while(list.size() == capacity)
                    wait();
            }
            System.out.println("produced " + value);
            list.add(value++);
            notify();

            Thread.sleep(1000);
        }
    }
    public void consume() throws InterruptedException {
        while(true){
            synchronized (this){
                while(list.isEmpty())
                    wait();

                int val = list.remove(0);
                System.out.println("Consumed " + val);
                notify();

                Thread.sleep(1000);

            }
        }
    }
}
class Producer implements Runnable{
    PC pc = new PC();
    @Override
    public void run(){
        try {
            pc.produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Consumer implements Runnable{
    PC pc = new PC();
    @Override
    public void run(){
        try {
            pc.consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}