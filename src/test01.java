import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import jdk.internal.dynalink.beans.StaticClass;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test01 {

	public static void main(String[] args) {
		/*
		 * Fu f = new Zi(); f.method(); f.show();
		 */

		// String s1=new String("abc");
		// String s1="a"+"b"+"c";
		/*
		 * String s1="ab"; String s2="abc"; String s3=s1+"c";
		 * System.out.println(s3==s2); System.out.println(s3.equals(s2));
		 */

		/* treeSet �Ƚ������� */
		/*
		 * TreeSet<person> ts=new TreeSet<person>(new ComplareByPerson());
		 * 
		 * 
		 * 
		 * Integer i1=new Integer(97); Integer i2=new Integer(97);
		 * System.out.println(i1==i2); System.out.println(i1.equals(i2));
		 * System.out.println("================================");
		 * 
		 * Integer i3=97; Integer i4=97; System.out.println(i3==i4);
		 * System.out.println(i3.equals(i4));
		 * System.out.println("===================");
		 * System.out.println(i3==i2); System.out.println(i3.equals(i2));
		 */
		/*
		 * sin si=new sin(); System.out.println(si+"\n===");
		 * System.out.println(sin.getsin()+"\n=======");
		 * System.out.println(sin.getsin()+"\n=======");
		 */

		/*Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			StringBuilder strb = new StringBuilder();
			char[] charArr = str.toCharArray();
			for (int i = charArr.length - 1; i >= 0; i--) {
				strb.append(charArr[i]);
			}
			System.out.println(strb.toString());
		}*/
		/*int x=1; 
		int y=2; 
		int z=3;
		y+=z--/++x;
		System.out.println(y);*/
		
		/*System.out.println(getValue(2));*/
		
		  System.out.println(getListPerson());     
	}
	
	static boolean getListPerson(){
		List< person> arrList1=new ArrayList<person>();
		List< person> arrList2=new ArrayList<person>();
		person p1=new person();
		person p2=new person();
		person p3=new person("zhan", 17);
		p1.setAge(18);
		p1.setName("li");
		p2.setAge(18);
		p2.setName("li");
		arrList1.add(p1);  
		arrList2.add(p2);
		arrList2.add(p3);
		return arrList1.equals(arrList2);
	}
	
	static int getValue (int i){
	    int result=0;
	    switch(i)
	    {
	     	case 1: result=result+i; 
	     	case 2: result =result +i *2;
	     	case 3: result=result+i*3; 
	     }
	    return result;
	 }

}



class ComplareByPerson implements Comparator<person> {

	@Override
	public int compare(person p1, person p2) {

		return 0;
	}

}

class Fu {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

class sin {

	sin() {
	}

	private static final sin sing = new sin();

	public sin getsin() {

		return sing;

	}
}
