package network;

import java.net.Socket;

public class Client {
	   public static void main(String[] args) {
	        try{
	            System.out.println("client started");
	            Socket soc = new Socket("localhost",9806);
	            soc.close();
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }
}
