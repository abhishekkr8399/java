package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws IOException {
        byte data[] = new byte[1024];
        DatagramSocket socket = new DatagramSocket();
        Scanner stdin = new Scanner(System.in);
        InetAddress ipAddr = InetAddress.getByName("localhost");
        System.out.println("Client up and ready...");
        while(true){
            System.out.print(">");
            String clientMsg = stdin.nextLine();
            DatagramPacket packet = new DatagramPacket(clientMsg.getBytes(),clientMsg.getBytes().length,ipAddr,8000);
            socket.send(packet);
            if(clientMsg.equals("close")) break;
            packet = new DatagramPacket(data,data.length);
            socket.receive(packet);
            String serverMsg = new String(packet.getData(),0,packet.getLength());
            System.out.println(serverMsg);
            if(serverMsg.equals("close")) break;
        }
        socket.close();
        System.out.println("Chat ended");
        
    }
}
