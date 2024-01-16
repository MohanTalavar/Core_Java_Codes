import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) throws Exception{
		int a= Integer.parseInt("123");
		System.out.println(a);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse("20-05-2000");
		System.out.println(d1);

	}

}
