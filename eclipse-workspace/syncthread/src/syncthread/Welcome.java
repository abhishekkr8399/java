package syncthread;
import java.io.*;
import java.util.Scanner;
public class Welcome {
 public static void main(String[] args) throws FileNotFoundException {
 PrintWriter pw = new PrintWriter("f3.txt");
 File f1 = new File("f1.txt");
 File f2 = new File("f2.txt");
 Scanner s1 = new Scanner(f1);
 Scanner s2 = new Scanner(f2);
 while(s1.hasNext()){
 String temp = s1.nextLine();
 pw.println(temp);
 }
 while(s2.hasNext()){
 String temp = s2.nextLine();
 pw.println(temp);
 }
 System.out.println("copied successfully!!");
 pw.flush();
 pw.close();
 }
}
