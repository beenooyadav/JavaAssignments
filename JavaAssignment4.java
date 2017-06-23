import java.util.*;
import java.text.*;

public class JavaAssignment4 {
	public static void main(String[] args) throws Exception {
		/*please inter date in dd/MM/yyyy format and pass it as commandline
		argument first argument as signup date and second argument as current date*/
		Calendar signup=Calendar.getInstance();
		Calendar current=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		signup.setTime(sdf.parse(args[0]));
		current.setTime(sdf.parse(args[1]));

		Calendar rangeup=Calendar.getInstance();
		rangeup.setTime(sdf.parse(args[0]));
		rangeup.set(Calendar.YEAR,current.get(Calendar.YEAR));
		Calendar rangelow=Calendar.getInstance();
		rangelow.setTime(sdf.parse(args[0]));
		rangelow.set(Calendar.YEAR,current.get(Calendar.YEAR));

		rangeup.add(Calendar.DATE,30);
		rangelow.add(Calendar.DATE,-30);

		if(current.after(rangelow)&&current.before(rangeup)){
			System.out.println("range for kyc is "+sdf.format(rangelow.getTime())+"  to  "+sdf.format(rangeup.getTime()));
		}else if(current.after(rangeup)){
			System.out.println("BackDate Kyc :range for kyc is "+sdf.format(rangelow.getTime())+"  to  "+sdf.format(rangeup.getTime()));
		}else if(current.before(rangelow)){
			rangeup.add(Calendar.YEAR,-1);
			rangelow.add(Calendar.YEAR,-1);
			System.out.println("BackDate kyc :range for kyc is "+sdf.format(rangelow.getTime())+"  to  "+sdf.format(rangeup.getTime()));
		}
	}
}
