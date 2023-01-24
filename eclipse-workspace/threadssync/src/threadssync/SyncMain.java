/*
Write a multithread java program to display the message [Welcome] [To][Java] by 
three separate child threads using the concept of synchronization.

*/
package threadssync;

public class SyncMain {
        public static void main(String[] args) {
                Printer printer = new Printer();
                new PrinterThread(printer, "Welcome").start();
                new PrinterThread(printer, "To").start();
                new PrinterThread(printer, "Java").start();
        }
}
