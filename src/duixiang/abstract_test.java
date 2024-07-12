package duixiang;

public class abstract_test {

	public static void main(String[] args) {
		jichuteacher jct=new jichuteacher("me",21);
		System.out.print(jct.getName()+"  "+jct.getAge()+"　");
		jct.teach();
	}

}

abstract class teachered {
	private String name;
	private int age;

	public teachered() {

	}

	public teachered(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void teach();

}

class jichuteacher extends teachered {

	public jichuteacher() {

	}

	public jichuteacher(String name, int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println("基础班老师指教基础！");

	}

}