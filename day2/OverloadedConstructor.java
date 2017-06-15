public class OverloadedConstructor {
	OverloadedConstructor() {
		this(10);
		System.out.println("first constructor");
	}
	OverloadedConstructor(int n) {
		System.out.println("second constructor having argument as = "+n);
	}
	public static void main(String[] args){
		OverloadedConstructor ob= new OverloadedConstructor();
	}
}
