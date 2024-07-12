  package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import duixiang.interface_Dog_Cat;


public class jiami {
	
	public static void main(String[] args)  {
		String str1="D:/软件/MobileFile/copy";
		String  str2=").jpg";
		
		for(int i=1;i<64;i++){
		/*String str3=str1+i+str2;*/
		/*String str3="D:/软件/MobileFile/copy1).jpg";
		String copystr4="C:/Program Files/jpg/"+i+str2;*/
			String copystr4=str1+i+str2;
			
			String str3="D:/软件/MobileFile/copy("+i+").jpg";
		
		try {
			jiami(copystr4,str3);
		} catch (IOException e) {
			System.out.println("找不到对应的文件"+e.getMessage());
		}
		}
	}
		public static void  jiami(String str1,String str2) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				str1));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(str2));
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len^ 123 ); 
		}
		bis.close();
		bos.close();
	}
}
