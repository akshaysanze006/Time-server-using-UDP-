 Time Server 
import java.io.*; 
import java.net.*; 
import java.util.*; 
public class TimeServer{ 
 public static void main(String[] args)throws IOException 
 { 
 byte[] receive,sendbuf; 
 try{ 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  DatagramSocket server = new DatagramSocket(5589); 
 DatagramPacket dp = null; 
 InetAddress ip = InetAddress.getLocalHost();  
 System.out.println("Server Running !! "); 
 while(true) 
 { 
 receive = new byte[100]; 
 dp = new DatagramPacket(receive,receive.length); 
 server.receive(dp); 
String op=new String(receive); 
System.out.println("From client: "+op); 
 Date date = new Date();  
 String msg = date.toString(); 
 sendbuf= msg.getBytes(); 
 dp = new DatagramPacket(sendbuf,sendbuf.length,dp.getAddress(),dp.getPort());  server.send(dp); 
 msg = new String(receive); 
 System.out.println("Message sent to client!!"); 
 } 
 } 
 catch(Exception e) 
 { 
 } 
 } 
