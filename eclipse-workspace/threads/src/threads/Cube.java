package threads;

public class Cube extends Thread {

    private int n;

    public Cube(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Cube of " + (n + i) + ": " + Math.pow((n + i), 3));
                Thread.sleep(2000);
            } catch (InterruptedException ex) { }
        }
    }
}
