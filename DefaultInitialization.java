class Data {
	int a;
	char b;
}

public class DefaultInitialization {
	public static void main(String[] args) {
		System.out.println("printing the default value of not initialized data");
		Data obj= new Data();
		System.out.println("default int value = "+obj.a+" \ndefault char value = "+obj.b);
		System.out.println("this means default value of int is 0 and that of char is null that is why it is not getting printed");
	}
}
