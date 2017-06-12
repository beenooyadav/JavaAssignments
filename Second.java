package beenoo.assignment.singleton;

public class Second {
	String s;
	/* since a non static variable can't be initialized inside a static method. so we have first make object and initialize the string to
		its member string then return that object
	*/ 
	public static Second initialize(String e) {
		Second obj = new Second();
		obj.s=e;

		return obj;
	}
	public void  print() {
		System.out.println("string = "+s);
	}
}
