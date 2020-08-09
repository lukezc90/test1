package ieheima.Inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class upreceive {
    public static void main(String[] args) throws IOException {
        //创建socket对象(datagramsocket)
        //datagramsocket(int port)构造数据套接字并将其绑定到本地主机的任何可用端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //datagrampacket(byte[] buf, int length)构造一个datagrampacket，用于接收长度为length数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //调用datagramsocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并打印到控制台
        System.out.println("数据是："+ new String(dp.getData(),0,dp.getLength()));

        //关闭接收端
        ds.close();
    }
}
