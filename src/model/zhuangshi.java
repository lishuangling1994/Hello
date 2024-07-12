package model;



public class zhuangshi {

	public static void main(String[] args) {
		HeiMaStudent hms=new HeiMaStudent(new Student());
		hms.coder();
		int[] i=new int[20];
		for (int j : i) {
			i[j]=1;
		}
		for (int j : i) {
			System.out.print(i[j]+" ");
		}
		
		
		
	}
	
}
interface Coder{
	public void coder();
}
 
class Student implements Coder{
	public void coder() {
		System.out.println("javase");
		System.out.println("javaweb");
	}

}

class HeiMaStudent implements Coder{
	private Student s;
	
	public HeiMaStudent (Student s){
		this.s=s;
	}
	
	public void coder() {
		s.coder();
		System.out.println("ssh");
		System.out.println("sql");
		System.out.println("´óÊý¾Ý");
		System.out.println("....");
		
	}
	
}