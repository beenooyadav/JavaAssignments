interface History {
	void u();
	void v();
}

interface Exam {
	void w();
	void x();
}

interface Labs {
	void y();
	void z();
}

interface Workup extends History, Exam, Labs {
	void zz();
}

class Doctor {
	public void doc() {System.out.println("doctor class");}
}

class Anesthesiologist extends Doctor implements Workup {
	public void u() {System.out.println("method of history");}
	public void v() {System.out.println("method of history");}
	public void w() {System.out.println("method of exam");}
	public void x() {System.out.println("method of exam");}
	public void y() {System.out.println("method of labs");}
	public void z() {System.out.println("method of labs");}
	public void zz() {System.out.println("method of workup");}
}

public class Assign3 {
	public static void m1(History history) { history.v(); }
	public static void m2(Exam exam) { exam.w(); }
	public static void m3(Labs labs) { labs.y(); } 
	public static void m4(Workup workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist anes = new Anesthesiologist();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}
