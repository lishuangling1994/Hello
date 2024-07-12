package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class resice {

	public static void main(String[] args) throws IOException   {
		DatagramSocket ds=new DatagramSocket(6666);
		while(true){
		DatagramPacket dp=new DatagramPacket(new byte[1024],1024);
		ds.receive(dp);
		byte[] a=dp.getData();
		int len=a.length;
		String ip=dp.getAddress().getHostAddress();
		System.out.println(ip+"  "+ new String(a,0,len));
		}
	}

}
