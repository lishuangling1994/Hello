package DiGuiLianXi;

import java.io.File;
import java.util.Scanner;

//* ����:1,�Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С
public class WenJian {

	public static void main(String[] args) {
		WenJian wjJian=new WenJian();
		File file=wjJian.getFile();
		System.out.println(wjJian.getsum(file));
	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��������Ҫ��ѯ���ļ�����");
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("������Ĳ����ļ�");
			} else if (file.isFile()) {
				System.out.println("����������ļ�");
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
