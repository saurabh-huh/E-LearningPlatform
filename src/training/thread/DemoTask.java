package training.thread;

public class DemoTask implements Runnable{
    private String name;
    public DemoTask(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Executing " + name);
    }
}
