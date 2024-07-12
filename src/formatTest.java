public class formatTest {
	public static void main(String[] args) {
		String str1 = String.format("test:%2d%s", 10, "×Ö·û´®");
		System.out.println(str1);
		testRoud();
	}
	static void testRoud(){
		double d1=-1.5;
		System.out.println(Math.round(d1));
	}
}
