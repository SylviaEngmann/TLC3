public class CancelWithInterrupt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*****1*****");
        Thread hello = new Thread(() -> {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){}
            }
        });
        hello.start();
        hello.sleep(5000);
        hello.interrupt();
        System.out.println("*****2*****");

    }
}
