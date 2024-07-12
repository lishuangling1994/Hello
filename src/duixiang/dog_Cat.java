package duixiang;

public class dog_Cat {

	public static void main(String[] args) {
		cat cat=new cat("red",4);
		System.out.println(cat.getColor()+cat.getLeg());
		cat.eat();
		cat.zhu();
		dog dog=new dog("black",4);
		System.out.println(cat.getColor()+cat.getLeg());
		dog.eat();
		dog.look();
	}

}

class animal{
	private String color;
	private int leg;
	public animal(){}
	public animal(String color,int leg){
		this.color=color;
		this.leg=leg;
	}
	public void eat(){
		System.out.println("  eat");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}

class cat extends animal{
	public cat(){}
	public cat(String color,int leg){
		super(color,leg);
	}
	public void zhu(){
		System.out.print("  √®◊Ω¿œ Û");
	}
}
class dog extends animal{
	public dog(){}
	public dog(String color,int leg){
		super(color,leg);
	}
	public void look(){
		System.out.println("   dog can lookhome");
	}
}
