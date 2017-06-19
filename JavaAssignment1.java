import java.io.*;
import java.util.*;

public class JavaAssignment1 {
	public static void main(String[] args) {
		String s;
        	Process p;
        	try {
			Scanner  sc=new Scanner(System.in);
			System.out.println("enter the regular expression to find the file");
			String ex=sc.next();
			while(true ){
            			p = Runtime.getRuntime().exec("find / -name "+ex);
            			BufferedReader br = new BufferedReader(
            	        	new InputStreamReader(p.getInputStream()));
           	        	while ((s = br.readLine()) != null)
           				System.out.println("file: " + s);
            			p.waitFor();
            			System.out.println ("enter next expression or enter 'exit' for exit: " + p.exitValue());
            			p.destroy();
				ex=sc.next();
				if(ex.equals("exit"))
					break;
			}
        	} catch (Exception e) {}
	}
}
