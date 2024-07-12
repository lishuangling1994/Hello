package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class tcpThread {

	public static void main(String[] args) {
		new server().start();
		
		new clientt().start();

	}

}
class clientt extends Thread{
	public void run(){
		try {
			Socket s=new Socket("127.0.0.1", 9999);
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			byte[] b=new byte[1024];
			int len=is.read();
			System.out.println(new String(b,0,len));
			os.write("我性情不好".getBytes());
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class server extends Thread{
	public void run(){
		try {
			ServerSocket ss=new ServerSocket( 9999);
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			os.write("百度一下你就直到".getBytes());
			byte[] b=new byte[1024];
			int len=is.read();
			System.out.println(new String(b,0,len));
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
