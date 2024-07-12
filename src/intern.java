

public class intern {
	public static void main(String[] args) {
	testIntern();
	System.out.println("============");
	testIntern2();
	}
   public static void testIntern(){
	   String str1=new StringBuilder("ja").append("va").toString();
	   System.out.println(str1);
	   System.out.println(str1.intern());
	   System.out.println(str1==str1.intern());
   }
   public static void testIntern2(){
	   String str2=new StringBuilder("li").append("shuangling").toString();
	   System.out.println(str2);
	   System.out.println(str2.intern());
	   System.out.println(str2==str2.intern());
   }
   
}
