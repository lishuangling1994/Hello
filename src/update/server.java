package update;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);
		while(true){
		new Thread(){
			public void run(){
				try {
					Socket s=ss.accept();
					System.out.println("服务器已经连接！");
					BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					PrintStream pw=new PrintStream(s.getOutputStream());
					String file=br.readLine();
					File dir=new File("update");
					dir.mkdir();
					File newfile=new File(dir,file);
					if (newfile.exists()) {
						pw.println("存在");
						pw.flush();
						s.close();
						return;
					}else {
						
						pw.println("不存在");
					}
					FileOutputStream fos = new FileOutputStream(file);
					byte[] arr = new byte[8192];
					int len;
					
					while((len = br.read()) != -1) {
						fos.write(arr, 0, len);
					}
					
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		}
		
	}

}
