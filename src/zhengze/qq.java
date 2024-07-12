package zhengze;

public class qq {

	public static void main(String[] args) {
		qq qq=new qq();
		System.out.println(qq.checkQQ("1232352"));
	}
	public boolean checkQQ(String str){
		String regx="[1-9]\\d{4,14}";
		
		return str.matches(regx);
		
	}

}
