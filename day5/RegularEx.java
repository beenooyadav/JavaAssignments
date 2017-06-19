import java.util.regex.*;

public class RegularEx {
	public static void main(String[] args ){
		String reguex="^[A-Z].*\\.";
		Pattern p=Pattern.compile(reguex);
		Matcher m;

		String sent="I am Beenoo.";
		m=p.matcher(sent);
		System.out.format("Sentence\t\tfollow the pattern\n");
		System.out.format("%s\t\t%s\n",sent,m.find());
	}
}
