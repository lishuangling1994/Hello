package IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class String_Reaser {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("sf"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		String len;
		while ((len=br.readLine())!=null) {
			bw.write(len);
			//bw.newLine();
			
		}
		bw.close();
		br.close();
	}

}
