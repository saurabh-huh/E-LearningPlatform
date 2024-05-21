package training.thread;

import java.util.Random;
import java.util.concurrent.Executors;

public class Main {
    private static final int numRequest = 1000;
    public static void main(String[] args) {
        final Server server = new Server();
        final Random random = new Random();

        try(var executor = Executors.newFixedThreadPool(numRequest)){
            for(int i=0;i<numRequest;i++){
                executor.submit(()-> {
                    try{
                        while(!server.tryLogin()){
                            Thread.sleep(random.nextInt(1000));
                        }
                        Thread.sleep(random.nextInt(1000));
                        server.logout();
                    } catch (IllegalAccessError e){
                        throw new RuntimeException();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }

        }
    }
}
