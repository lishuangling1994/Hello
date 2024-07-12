package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		pro.load(new FileInputStream("cofig.properties"));
		System.out.println(pro);
		String age=pro.getProperty("age");
		System.out.println(age);
		pro.store(new FileOutputStream("xxx.txt"), null);
		
	}

}
