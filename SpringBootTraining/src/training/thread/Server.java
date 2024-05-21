package training.thread;

import java.util.concurrent.Semaphore;

public class Server {
    private final Semaphore semaphore;
    private static final int numUsers = 100;
    public Server(){
        semaphore = new Semaphore(numUsers);
        Thread thread = new Thread(this::printStatus);
        thread.start();

    }

    private void printStatus() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(numUsers - semaphore.availablePermits());
        }
    }
    public boolean tryLogin(){
        return semaphore.tryAcquire();
    }
    public void logout(){
        semaphore.release();
    }
}
