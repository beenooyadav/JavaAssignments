public class ObjectReference_3 {
	ObjectReference_3(String obj) {
		System.out.println("argument= "+obj);
	}

	public static void main(String[] args) {
		ObjectReference_3 [] objects = new  ObjectReference_3 [10];
		// initialization message dont get printed.

                //Assignment 4 start
                for(int i=0;i<10;i++)
                {
                        objects[i]= new ObjectReference_3("i am "+i+"th object");
                }

	}
}
