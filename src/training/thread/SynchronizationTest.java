package training.thread;
class Counter{
    static int count = 0;
    public synchronized void getCount(){
        count++;
        System.out.println(count);
    }
}
public class SynchronizationTest {
    public static void main(String[] args) {
        final Counter obj = new Counter();

        Thread a = new Thread() {
            public void run() { obj.getCount(); }
        };

        Thread b = new Thread() {
            public void run() { obj.getCount(); }
        };
        a.start();
        b.start();





        a.interrupt();
        b.interrupt();
    }
}
