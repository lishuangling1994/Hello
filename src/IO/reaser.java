package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class reaser {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("sf"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("copyseavers.txt"));
		String line;
		ArrayList<String> list=new ArrayList<String>();
		while ((line=br.readLine())!=null) {
				list.add(line);
		}
		for (int i = list.size()-1; i >=0 ; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
