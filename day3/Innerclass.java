class Big1 {
	class Small1 {
		Small1(int i) {System.out.println("i am inner1");}
	}
}

class Big2 {
        class Small2 extends Big1.Small1 {
                Small2(Big1 i) {
			i.super(10);
			System.out.println("i am inner2");
		}
        }
}

public class Innerclass {
	public static void main(String[] args) {
		Big2 ob= new Big2();
		Big2.Small2 ob1 = ob.new Small2(new Big1());
	}
}
