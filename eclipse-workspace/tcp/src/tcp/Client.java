package tcp;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8000);
        System.out.println("Connected to server..\nChat begins");
        Scanner socketIn = new Scanner(s.getInputStream());
        PrintWriter socketOut = new PrintWriter(s.getOutputStream(),true);
        Scanner stdin = new Scanner(System.in);
        while(true){
            System.out.print(">");
            String clientMsg = stdin.nextLine();
            socketOut.println(clientMsg);
            if(clientMsg.equals("close")) break;
            String serverMsg = socketIn.nextLine();
            System.out.println(serverMsg);
            if(serverMsg.equals("close")) break;
        }
        s.close();
        System.out.println("Connection closed.");
    }
}
