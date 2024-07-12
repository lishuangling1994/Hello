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
		if (result.equals("����")) {
			System.out.println("���ϴ����ļ��Ѿ�����,�벻Ҫ�ظ��ϴ�");
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
		System.out.println("����һ���ļ�·����");
		Scanner sc=new Scanner(System.in);
		while (true) {
			String line=sc.nextLine();
			File file=new File(line);
			
			if (!file.exists()) {
				System.out.println("��������ļ������ڣ�");
			}else if(file.isDirectory()){
				System.out.println("����������ļ���·����");
			}else{
			return file;
			}
		}
		
	}
	

}
