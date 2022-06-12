
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q1 = new Queue();
		
		q1.insert(100);
		q1.insert(300);
		q1.insert(500);
		q1.remove();
		
	//	q1.insert(700);
	//	q1.insert(800);
		//q1.insert(900);
		System.out.println(q1);
		
		Queue q2 = new Queue();
		q2.insert(1000);
		q2.insert(5000);
		q2.insert(3);
		q2.insert(4);
		System.out.println(q2);
	}

}
