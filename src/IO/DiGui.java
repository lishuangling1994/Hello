package IO;

public class DiGui {

	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	public static int fun(int i){
		if (i==1) {
			return 1;
		}else {
			return	i*fun(i-1);	
		}
		
	}

}
