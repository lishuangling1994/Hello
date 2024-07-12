package duixiang;

public class Teahcer_Student {

	public static void main(String[] args) {
		student s=new student("ÕÅÈý",21);
		System.out.print(s.toString());
		s.eat();
		s.sleep();
		s.study();
		teacher teacher=new teacher("°½Åà",36);
		System.out.print(teacher.toString());
		teacher.sleep();
		teacher.eat();
		teacher.jiao();
	}

}
class men{
	private String name;
	private int age;
	
	public men(){}
	public men(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void eat(){
		System.out.print("  ³Ô·¹");
	}
	public void sleep(){
		System.out.print("  Ë¯¾õ");
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
	@Override
	public String toString() {
		return "men [name=" + name + ", age=" + age + "]";
	}
	
	
}
class student extends men{
	 public student() {}
	 public student(String name,int age){
		 super(name,age);
	 }
	public void study(){
		System.out.println("Ñ§Ï°");
	}
}
class teacher extends men{
	public teacher() {}
	 public teacher(String name,int age){
		 super(name,age);
	 }
	public void jiao(){
		System.out.println("½²¿Î");
	}
}

