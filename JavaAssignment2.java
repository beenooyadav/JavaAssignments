import java.io.*;
import java.util.*;

public class JavaAssignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\n");
		String s=sc.next();
		s=s.replaceAll("[^a-zA-Z]","");
		s=s.toLowerCase();
		s=s.replaceAll("(.)(?=.*\\1)", "");
		if(s.length()==26)
			System.out.println("contains all the letters of the alphabet a-z case insensitive");
		else
			System.out.println("check failed");
	}
}
