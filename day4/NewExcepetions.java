class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends NullPointerException {}

public class NewExcepetions {
	void method(String a) throws Exception1 ,Exception2,Exception3 {
		if(a=="bee")
			throw new Exception1();
		if(a=="kris")
			throw new Exception2();
		if(a==null) 
			throw new Exception3();
	}
	public static void  main(String[]args) { 
		NewExcepetions ob= new NewExcepetions();
		try {
			String s=null;
			ob.method(s); //change argument for different exception
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace(System.out);
		}finally{
			System.out.println("finally: will always execute me");
		}
	}
}
