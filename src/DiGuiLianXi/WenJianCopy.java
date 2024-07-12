package DiGuiLianXi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


//���̽��������ļ��У���һ���ļ����е������ļ���copy����һ���ļ�����
public class WenJianCopy {

	public static void main(String[] args) throws IOException {
		File gen=WenJianCopy.getFile();
		File mudi=WenJianCopy.getFile();
		copy(gen,mudi);

	}
	
	

	public static File getFile(){
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("������Ҫ���ܵ��ļ��У�");
			String line=sc.nextLine();
			File file=new File(line);
			if (!file.exists()) {
				System.out.println("������Ĳ����ļ��У�");
			}else if(file.isFile()){
				System.out.println("����������ļ���");
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
