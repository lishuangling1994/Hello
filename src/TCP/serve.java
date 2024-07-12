package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serve {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(9999);
		while (true) {
			Socket s=ss.accept();
			new Thread(){
				public void run(){
					try {
					BufferedReader bis=new BufferedReader(new InputStreamReader(s.getInputStream()));
					PrintWriter pw=new PrintWriter(s.getOutputStream());
					String str=bis.readLine();
					StringBuilder sb=new StringBuilder(str);
					System.out.println(sb.reverse());
					pw.println(str);
					pw.flush();
					s.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
			
		}
		
	}

}
