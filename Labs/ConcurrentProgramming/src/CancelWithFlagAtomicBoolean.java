import java.util.concurrent.atomic.AtomicBoolean;

public class CancelWithFlagAtomicBoolean {
    static AtomicBoolean running = new AtomicBoolean(true);
    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while (running.get()) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){}
            }
        });
        hello.start();
        hello.sleep(5000);
        running.set(false);
        System.out.println("Thread running "+ running);
    }
}
