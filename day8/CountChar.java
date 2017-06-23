import java.util.*;
import java.io.*;
import java.lang.*;

class Count {
	Map<Character,Integer> list=new HashMap<Character,Integer>();
	String filename;
	Count(String file) {
		filename=file;
	}
	void calculateChar() throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(filename));
		//String s;
		int c;
		while((c=br.read())!=-1){
			//char [] arr=s.toCharArray();
			//for(char c:arr){
			list.merge((char)c,1,Integer::sum);
			//}
		}
	}
}
public class CountChar {
	public static void main(String[] args) throws Exception {
		if(args.length<1){
			System.out.println("please give filename as commandline argument");
			System.exit(0);
		}

		Count ob=new Count(args[0]);
		ob.calculateChar();
		String output =new String("OutputOfDay8.txt");//output file
		PrintWriter out = new PrintWriter(output);
		for(Map.Entry<Character,Integer> e: ob.list.entrySet()){
			out.println(e.getKey()+"  =  "+e.getValue());
		}

		out.close();
	}
}
