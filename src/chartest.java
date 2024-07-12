import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class chartest {

	public static void main(String[] args) throws UnsupportedEncodingException {

		char a = 57;
		System.out.println(a);
		String name = "жа";
		byte[] b=name.getBytes();
		System.out.print(Arrays.toString(b));

		/*
		 * Set set = new HashSet(); set.add("w"); set.add("r"); set.add("w");
		 * for (Object object : set) { System.out.println(object); }
		 */
	}

}
