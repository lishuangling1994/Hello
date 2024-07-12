package DiGuiLianXi;

import java.io.File;
import java.util.Scanner;

//* 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
public class WenJian {

	public static void main(String[] args) {
		WenJian wjJian=new WenJian();
		File file=wjJian.getFile();
		System.out.println(wjJian.getsum(file));
	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入你要查询的文件名：");
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("你输入的不是文件");
			} else if (file.isFile()) {
				System.out.println("你输入的是文件");
			} else{
				return file;
			}
			
		}
		
	}
	
	public static long getsum(File file){
		long len = 0;
		File[] subf=file.listFiles();
		for (File file2 : subf) {
			if (file2.isFile()) {
				len=len+file2.length();
			}else if (file2.isDirectory()) {
				len=len+getsum(file2);
			}
		}
		return len;
		
	}
}
