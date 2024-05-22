package training.producerConsumer;

import java.util.concurrent.Semaphore;

public class PCUsingSemaphore {
    public static void main(String[] args) {

        ProdCon prodCon = new ProdCon();
        new Produce(prodCon);
        new Consume(prodCon);
    }
}
class ProdCon {
    int item;

    Semaphore semProd = new Semaphore(1);
    Semaphore semCom = new Semaphore(0);

    public void get(){
        try {
            semCom.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Consumer :" + item);

        semProd.release();
    }

    public void put(int item){
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.item = item;
        System.out.println("Producer :" + item);

        semCom.release();
    }
}
class Produce implements Runnable{
    ProdCon prodCon;
    Produce(ProdCon prodCon){
        this.prodCon = prodCon;
        new Thread(this,"Produce").start();
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            prodCon.put(i);
        }
    }
}
class Consume implements Runnable{
    ProdCon prodCon;
    Consume(ProdCon prodCon){
        this.prodCon = prodCon;
        new Thread(this,"Consume").start();
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            prodCon.get();
        }
    }
}
