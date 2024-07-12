package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost", 9999);
		BufferedReader bis=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		Scanner scanner=new Scanner(System.in);
		pw.println(scanner.nextLine());
		pw.flush();
		System.out.println(bis.readLine());
		s.close();
	}

}
