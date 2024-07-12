package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Luru {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Text.txt"));
		System.out.println("输入你要录入的数据：");
		Scanner scanner=new Scanner(System.in);
		while (true) {
			String line=scanner.nextLine();
			bos.write(line.getBytes());
			if (line.equals("quit")) {
				bos.close();
				break;
				}
		
		}
	}

}
