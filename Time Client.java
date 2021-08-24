import java.io.*; 
import java.net.*; 
public class TimeClient{ 
 public static void main(String[] arg) 
 {  
 byte[] buf=null,receive; 
 try{ 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  DatagramSocket client = new DatagramSocket(); 
 DatagramPacket dp ; 
 InetAddress ip = InetAddress.getLocalHost(); // 127.0.0.1 
 String msg =" Request for Current Time from server "; 
 buf = msg.getBytes(); 
 dp = new DatagramPacket(buf,buf.length,ip,5589); 
 client.send(dp);  
 receive = new byte[100]; 
 System.out.println("Trial");  
 dp = new DatagramPacket(receive,receive.length); 
 client.receive(dp); 
 msg = new String(receive); 
 System.out.println("Current Time From Server : " + msg);  
 System.out.println("Connection Completed!");  
 } 
 catch(Exception e) 
 { 
 System.out.println("Error!!"+e); 
 }}} 
