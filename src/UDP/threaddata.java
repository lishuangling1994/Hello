package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class threaddata {

	public static void main(String[] args) {
		new resiceed().start();
		
		new sended().start();
	}

}

class sended extends Thread {
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				if (line.equals("quit")) {
					break;
				}
				DatagramSocket ds = new DatagramSocket();
				DatagramPacket dp = new DatagramPacket(line.getBytes(),
						line.getBytes().length,
						InetAddress.getByName("localhost"), 6666);
				ds.send(dp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class resiceed extends Thread {
	public void run() {
		try {

			DatagramSocket ds = new DatagramSocket(6666);
			while (true) {
				DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
				ds.receive(dp);
				byte[] a = dp.getData();
				int len = a.length;
				String ip = dp.getAddress().getHostAddress();
				int port=dp.getPort();
				System.out.println(ip + "  "+dp+"  " + new String(a, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
