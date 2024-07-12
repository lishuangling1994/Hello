package duixiang;

public class Supermen_person {

	public static void main(String[] args) {
		person p=new supermen();
		System.out.println(p.name);
		p.talk();
		supermen s=(supermen)p;
		p.fly();
		

	}

}

class person{
	String name="me";
	public void talk(){
		System.out.println("谈生意");
	}
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
class supermen extends person{
	String name="superme";
	public void talk(){
		System.out.println("谈大生意");
	}
	public void fly(){
		System.out.println("放出去救人");
	}
}
