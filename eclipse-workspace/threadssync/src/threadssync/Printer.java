package threadssync;

public class Printer {
	synchronized void print(String msg) {
                System.out.print("[" + msg);
                try {
                        Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                        System.out.println("Thread Interrupted");
                }
                System.out.println("]");
        }
}
