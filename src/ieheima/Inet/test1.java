package ieheima.Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("LAPTOP-DPHMD63A");

        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名："+ name);
        System.out.println("ip: "+ ip);
    }
}
