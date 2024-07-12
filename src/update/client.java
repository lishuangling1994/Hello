package update;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import duixiang.interface_Dog_Cat;

public class client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost", 6666);
		File file=getfile();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(file.getName());
		String result=br.readLine();
		if (result.equals("存在")) {
			System.out.println("您上传的文件已经存在,请不要重复上传");
			s.close();
			return;
		}else{
			FileInputStream fis=new FileInputStream(file);
			byte[] b=new byte[1024];
			int len=fis.read(b);
			while (len!=1) {
				ps.write(b,0,len);
			}
			fis.close();
			s.close();
		}
	}
	public static File getfile(){
		System.out.println("输入一个文件路径：");
		Scanner sc=new Scanner(System.in);
		while (true) {
			String line=sc.nextLine();
			File file=new File(line);
			
			if (!file.exists()) {
				System.out.println("你输入的文件不存在！");
			}else if(file.isDirectory()){
				System.out.println("你输入的是文件夹路径！");
			}else{
			return file;
			}
		}
		
	}
	

}
