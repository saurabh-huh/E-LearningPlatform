package training.thread;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private final String name;
    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws InterruptedException {
        Thread.sleep(2000);
        return "Hello " + name;
    }
}

public class ThreadPoolExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welocomeFuture = executorService.submit(new CallableTask("1234asd"));
        System.out.println(welocomeFuture.get());
        System.out.println("Main Completed");
        executorService.shutdown();
    }

}
