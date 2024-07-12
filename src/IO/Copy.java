package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		try(
		FileInputStream fis=new FileInputStream("sf");
		FileOutputStream fos=new FileOutputStream("copy.txt");
		){
			byte[] b=new byte[3];
			int len;
			while ((len=fis.read(b))!=-1) {
				fos.write(b,0,len);
			}
		}
	}

}
