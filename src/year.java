
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class year {

	public static void main(String[] args) throws ParseException {
		String birthday="1994��12��31��";
		String today="1994��01��01��";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��mm��dd��");
		Date date1=sdf.parse(birthday);
		Date date2=sdf.parse(today);
		long str=date1.getTime()-date2.getTime();
		System.out.println(str/1000/60/60/24);
		

	}

}
