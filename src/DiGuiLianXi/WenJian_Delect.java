package DiGuiLianXi;

import java.io.File;
import java.util.Scanner;

public class WenJian_Delect {
	// ����һ���ļ���·����ɾ������������ļ���
	public static void main(String[] args) {
		WenJian_Delect wd=new WenJian_Delect();
		
		//wd.delect(wd.getFile());
	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������Ҫɾ�����ļ���·��");
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("������� �����ļ���·����");
			} else if (file.isFile()) {
				System.out.println("����������ļ�");
			} else {
				return file;
			}

		}

	}
	
	public static void delect(File file){
		File[] subfFiles=file.listFiles();
		for (File file2 : subfFiles) {
			if (file2.isFile()) {
				file2.delete();
			}else if (file2.isDirectory()) {
				delect(file2);
			} 
			file.delete();
		}
	}
}
