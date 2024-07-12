package DiGuiLianXi;
//不死神兔，一对小兔子三个月后生下一对小兔子，第四个月继续生小一对，
//第五个月，继续生，第三个月的小兔子也能生。假設兔子不死12個月后一共有多少对兔子。
public class TuZi {

	public static void main(String[] args) {
		//常规数组方法
		/*int[] c=new int[8];
		c[0]=1;
		c[1]=1;
		for (int i = 2; i < c.length; i++) {
			c[i]=c[i-2]+c[i-1];
			System.out.println(c[i]);
		}*/
		System.out.println(fun(8));
		
	}
	//用递归做
	public static int fun(int i){
		if (i==1||i==2) {
			return 1;
		}else {
			return fun(i-2)+fun(i-1);
		}
		
		
	}

}
