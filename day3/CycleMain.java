class Cycle { }

class Unicycle extends Cycle {
	Unicycle() {System.out.println("i am Unicycle");}
	void balance() {System.out.println("balancing Unicycle");}
}

class Bicycle extends Cycle {
	Bicycle() {System.out.println("i am Bicycle");}
	void balance() {System.out.println("balancing Bicycle");}
}

class Tricycle extends Cycle {
	Tricycle() {System.out.println("i am Tricycle");}
}

public class CycleMain {
	public static void main(String[] args) {
		//upcasting
		Cycle [] cycles={new Unicycle(), new Bicycle(), new Tricycle()};
		/* when balance is called it gives error becasue of  upcasting
			error: cannot find symbol
			i.balance();
			 ^
		  symbol:   method balance()
  		  location: variable i of type Cycle
		1 error

		for(Cycle i: cycles) {
			i.balance();
		}
		*/

		//downcasting
		Unicycle ob1= (Unicycle) cycles[0];
		Bicycle ob2 =(Bicycle) cycles[1];
		ob1.balance();
		ob2.balance();
	}
}
