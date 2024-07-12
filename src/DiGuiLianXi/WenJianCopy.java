package DiGuiLianXi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


//键盘接受两个文件夹，将一个文件夹中的所有文件都copy到另一个文件夹中
public class WenJianCopy {

	public static void main(String[] args) throws IOException {
		File gen=WenJianCopy.getFile();
		File mudi=WenJianCopy.getFile();
		copy(gen,mudi);

	}
	
	

	public static File getFile(){
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("输入你要接受的文件夹！");
			String line=sc.nextLine();
			File file=new File(line);
			if (!file.exists()) {
				System.out.println("你输入的不是文件夹！");
			}else if(file.isFile()){
				System.out.println("你输入的事文件！");
			}else{
			return file;
			}
		}
		
		
	}
	public static void copy(File gen, File mudi) throws IOException {
		File newdir=new File(mudi,gen.getName());
		newdir.mkdir();
		File[] files=gen.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(newdir,file.getName())));
				int len;
				while ((len=bis.read())!=-1) {
					bos.write(len);
				}
				bos.close();
				bis.close();
			}else {
				copy(file, newdir);
			}
		}
	}

}
