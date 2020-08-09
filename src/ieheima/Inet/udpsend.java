package ieheima.Inet;

import java.io.IOException;
import java.net.*;

public class udpsend {
    public static void main(String[] args) throws IOException {
        //创建socket对象(datagramsocket)
        //datagramsocket()构造数据套接字并将其绑定到本地主机的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket
        //构造一个数据包，发送长度为length数据包到指定主机上的指定端口号
        byte[] bys = "hello,udp,我来了".getBytes();

        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.191.1"),10086);

        ds.send(dp);

        ds.close();
    }
}
