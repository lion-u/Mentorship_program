import java.net.UnknownHostException;

/**
 * Simple Java program to find IP Address of localhost. This program uses
 * InetAddress from java.net package to find IP address. 
 *
 * @author Javin Paul
 */
public class IPTest {
  
  
    public static void main(String args[]) throws UnknownHostException {
    
        InetAddress addr = InetAddress.getLocalHost();
      
        //Getting IPAddress of localhost - getHostAddress return IP Address
        // in textual format
        String ipAddress = addr.getHostAddress();
      
        System.out.println("IP address of host : " + ipAddress);
      
        //Hostname
        String hostname = addr.getHostName();
        System.out.println("Name of hostname : " + hostname);
      
    }
  
}