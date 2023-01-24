package threads;

public class Square extends Thread {

    private int n;

    public Square(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Square of " + (n + i) + ": " + Math.pow((n + i), 2));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
}
