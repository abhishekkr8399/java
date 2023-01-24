package tcp;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(8000);
        while(true){
            System.out.println("Server waiting for connection request...");
            Socket s = ss.accept();
            System.out.println("Connected from "+s.getInetAddress()+"\nWaiting for client message...");
            Scanner socketIn = new Scanner(s.getInputStream());
            PrintWriter socketOut = new PrintWriter(s.getOutputStream(),true);
            Scanner stdin = new Scanner(System.in);
            while(true){
                String clientMsg = socketIn.nextLine();
                System.out.println(clientMsg);
                if(clientMsg.equals("close")) break;

                System.out.print(">");
                String serverMsg= stdin.nextLine();
                socketOut.println(serverMsg);
                if(serverMsg.equals("close")) break;
            }
            s.close();
            System.out.println("Connection closed");
        }
        
    }
}