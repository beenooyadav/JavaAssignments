import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.util.*;

public class JavaAssignment3{

	public static double runSystemCommand(String command) {
		List<Double> times = new ArrayList<Double>();
		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String s = "";
			String reguex="time=.* ";
			Pattern pat=Pattern.compile(reguex);
			Matcher m;
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
				m=pat.matcher(s);
				if(m.find()){
					s=m.group();
					times.add(Double.parseDouble(s.substring(5,s.length()-1)));
					System.out.println(s);
				}
			}
			//Arrays.sort(times);
			Collections.sort(times);
			System.out.println("\n"+times);

		} catch (Exception e) {
			e.printStackTrace();
		}
		int sz=times.size();
		return (sz%2==0)?(times.get(((sz/2-1)+(sz/2))/2)):(times.get(sz/2));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		String ip = "";
		System.out.println("enter web address to be ping :");
		ip= i.readLine();
		double median=runSystemCommand("ping -c9 " +ip);
		System.out.println("the median of the time taken to ping "+ip+" = "+median);
	}
}
