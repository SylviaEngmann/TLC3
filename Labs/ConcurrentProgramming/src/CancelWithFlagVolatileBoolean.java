public class CancelWithFlagVolatileBoolean {
    static volatile boolean running = true;
    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while (running) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){}
            }
        });
        hello.start();
        hello.sleep(5000);
        running = false;
        System.out.println("Thread running "+ running);
    }
}
