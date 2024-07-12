
public class time {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
	
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}

}
