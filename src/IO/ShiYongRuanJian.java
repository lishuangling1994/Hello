package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ShiYongRuanJian {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("10"));
		String line=br.readLine();
		int i=Integer.parseInt(line);
		if (i>0) {
			System.out.println("你还有"+i--+"次机会！");
			br.close();
			FileWriter bw=new FileWriter("10");
			bw.write(i+"");
			bw.close();
		}else {
			System.out.println("您的使用次数已经到了，请购买正版！");
		}
	}

}
