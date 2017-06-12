package beenoo.assignment.main;

import beenoo.assignment.data.*;
import beenoo.assignment.singleton.*;

public class FirstMain {
	public static void main(String[] args) {
	First obj1= new First();
	obj1.print();
	//obj1.local(); it will create error as explained in First.java
	Second obj2=Second.initialize("hi i am string");
	obj2.print();
	}
}
