package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

//��һ���ı������ַ����ֵĸ���д��copy.txt��
public class PanDuan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sf"));
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		int len;
		while ((len=br.read())!=-1) {
			char c=(char) len;
			/*if (tm.containsKey(c)) {    �����ж�
				tm.put(c, tm.get(c)+1);
			}else {
				tm.put(c, 1);
			}*/
			tm.put(c,tm.containsKey(c) ? tm.get(c)+1 :1 );
		}
		
		/*String line;       �Լ�д�ı�����
		int count = 1;
*/	/*	while ((line = br.readLine()) != null) {
			char c[] = line.toCharArray();
			for (int i = 0; i < c.length; i++) {
				for (Character tm1 :tm.keySet()  ) {
					if (c[i]==tm1) {
						count++;
					}
				}
				tm.put(c[i], count);
			}

		}*/
		System.out.println(tm);
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("PanDuan.txt"));
		for (Character c : tm.keySet()) {
			bw.write(c+"="+tm.get(c));
			bw.newLine();
		}
		bw.close();
	}

}
