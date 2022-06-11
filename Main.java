
public class Main {

	public static void main(String[] args) {
	Cqueue q1 = new Cqueue();
		
		q1.insert(100);
		q1.insert(300);
		//q1.remove();
		
		q1.insert(700);
		q1.insert(800);
		q1.insert(900);
		q1.insert(200);
		System.out.println(q1);
	/*	
		Cqueue q2 = new Cqueue();
		q2.insert(1000);
		q2.insert(5000);
		q2.insert(3);
		q2.insert(4);
		System.out.println(q2);
		*/
	}
}
