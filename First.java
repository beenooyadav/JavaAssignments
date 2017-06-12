package beenoo.assignment.data;

public class First {
	int a;
	char b;
	
	public void print() {
		/*here no error will be shown as the field of a class get default
		initializtion. */
		System.out.println("intger = "+a+"\ncharacter = "+b);
	}
	/*public void local() {
		int c;
		char d;
		/* while compiling it gives following error for below line
		First.java:12: error: variable c might not have been initialized
		System.out.println("intger = "+c+"\n character = "+d);
		                               ^
		First.java:12: error: variable d might not have been initialized
		System.out.println("intger = "+c+"\n character = "+d);
		                                                   ^
		2 errors
		
		Explaination: because local variable of method dont get default
			      initialization so this is giving error.
 		running this we can comment this method.
		System.out.println("intger = "+c+"\n character = "+d);
	}*/
}
