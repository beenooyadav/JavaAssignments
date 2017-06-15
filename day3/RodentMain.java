abstract class Rodent {
	Rodent() { System.out.print("I am a Rodent->");}
	abstract void jump();
	abstract void eat();
}

class Mouse extends Rodent {
	Mouse() { System.out.println(" I am mouse");}
	void jump(){ System.out.println(" jumping mouse ");}
	void eat() { System.out.println(" eating mouse ");}
}

class Gerbil extends Rodent {
	Gerbil() { System.out.println("i am gerbil ");}
	void jump() { System.out.println(" jumping gerbil ");}
	void eat() { System.out.println(" eating gerbil ");}
}

class Hamster extends Rodent {
	Hamster() { System.out.println(" i am Hamster ");}
	void jump() { System.out.println(" jumping hamster ");}
	void eat() { System.out.println(" eating hamster");}
} 

public  class RodentMain {
	public static void main(String[] args) {
		Rodent[] objects= { new Mouse(), new Gerbil(), new Hamster()};

		for(Rodent i: objects) {
			i.jump();
			i.eat();
		}
	}
}
