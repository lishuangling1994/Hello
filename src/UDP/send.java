package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class send {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ���͵����ݣ�");
		while(true){
		String line=sc.nextLine();
		if (line.equals("quit")) {
			break;
		}
		DatagramSocket ds=new DatagramSocket();
		DatagramPacket dp=new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("localhost"), 6666);
		ds.send(dp);
		
		}
	}

}
