package training.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
    ThreadPoolExecutorService threadPoolExecutorService = new ThreadPoolExecutorService();
    public static void main(String[] args) {
        BlockingQueue<Runnable> blockingQueue =
                new LinkedBlockingQueue<Runnable>();

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(10, 20, 5L, TimeUnit.SECONDS, blockingQueue);

        executor.prestartAllCoreThreads();

        for (int i = 1; i <= 100; i++) {
            blockingQueue.offer(new DemoTask("Task " + i));
        }

        executor.shutdown();

    }
}