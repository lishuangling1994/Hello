package duixiang;

public class ChangFangXing {

	public static void main(String[] args) {
		Chang c=new Chang(10,20);
		c.mianJi();
		c.zhouChang();

	}

}
class Chang{
	private int witd;
	private int high;
	public Chang(){};
	public Chang(int witd,int high){
		this.witd=witd;
		this.high=high;
	}
	public int getWitd() {
		return witd;
	}
	public void setWitd(int witd) {
		this.witd = witd;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public void mianJi(){
		
		System.out.println(witd*high);
		
	}
public void zhouChang(){
		
		System.out.println((witd+high)*2);
		
	}
	
}
