package threadssync;

public class PrinterThread extends Thread {

    String msg;
    Printer printerObj;

    public PrinterThread(Printer printerObj, String msg) {
        this.msg = msg;
        this.printerObj = printerObj;
    }

    public void run() {
        printerObj.print(msg);
    }
}
