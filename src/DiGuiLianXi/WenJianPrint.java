package DiGuiLianXi;

import java.io.File;
import java.util.Scanner;

//��ȡһ���ļ��а���������ļ����㼶��ӡ
public class WenJianPrint {

	public static void main(String[] args) {
		WenJianPrint wp = new WenJianPrint();
		
		wp.print(wp.getFile(),0);

	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��������Ҫ��ӡ���ļ��У�");
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("������Ĳ����ļ���");
			} else if (file.isFile()) {
				System.out.println("����������ļ���");
			} else {
				return file;
			}

		}

	}
	public static void print(File file,int lev){
		File[] subfile=file.listFiles();
		for (File file2 : subfile) {
			if (file2.isFile()) {
				for (int i = 0; i <= lev; i++) {
					System.out.print("\t");
				}
				System.out.println(file2);
			}else {
				print(file2,lev+1);
				
				
			}
		}
		
	}
}
