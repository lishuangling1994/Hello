package duixiang;

public class interface_Dog_Cat {

	public static void main(String[] args) {
		catt c=new catt("jiafei","hese");
		System.out.println(c.getName()+c.getColor());
		c.eat();
		c.sleep();
		c.jump();

	}

}

abstract class animall{
	private String name;
	private String color;
	public animall(){}
	public animall(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void eat();
	public abstract void sleep();
}

interface catjump{
	public abstract void jump();


}

class catt extends animall implements catjump{
	
	public catt(){}
	public catt(String name,String color){
		super(name,color);
	}
	@Override
	public void jump() {
		System.out.print("»áÌø");
		
	}

	@Override
	public void eat() {
		System.out.print("³Ô·¹");
		
	}

	@Override
	public void sleep() {
		System.out.print("Ë¯¾õ");
	}
	
}
