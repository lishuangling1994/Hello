package DiGuiLianXi;

import java.io.File;
import java.util.Scanner;

//获取一个文件夹把他下面的文件按层级打印
public class WenJianPrint {

	public static void main(String[] args) {
		WenJianPrint wp = new WenJianPrint();
		
		wp.print(wp.getFile(),0);

	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入你要打印的文件夹：");
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("你输入的不是文件！");
			} else if (file.isFile()) {
				System.out.println("你输入的是文件！");
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
