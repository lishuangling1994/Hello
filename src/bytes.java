
public class bytes {

	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={22,5};
		b=a;
		b[1]=88;
		b[2]=99;
		System.out.println(a[0]+" " +a[1]+" "+a[2]);
		System.out.println(b[0]+" " +b[1]+" " +b[2]);
	}

}
