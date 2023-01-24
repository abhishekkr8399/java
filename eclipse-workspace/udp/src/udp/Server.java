package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8000);
        byte data[] = new byte[1024];
        while(true){
            System.out.println("Server waiting for messages ...");
            Scanner stdin = new Scanner(System.in);
            while(true){
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String clientMsg = new String(packet.getData(),0,packet.getLength());
                System.out.println(clientMsg);
                if(clientMsg.equals("close")) break;

                System.out.print(">");
                String serverMsg = stdin.nextLine();
                packet = new DatagramPacket(serverMsg.getBytes(),serverMsg.getBytes().length,packet.getAddress(),packet.getPort());
                socket.send(packet);
                if(serverMsg.equals("close")) break;

            }
            System.out.println("Chat ended");
        }
        
    }
    
}
