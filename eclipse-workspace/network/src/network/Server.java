package network;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("connection established");
            ss.close();
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
