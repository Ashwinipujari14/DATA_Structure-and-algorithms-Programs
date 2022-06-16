
public class Polynomial {

	polyNode start;
	

	
	
	public static void main(String []args)
	{
		Polynomial poly1= new Polynomial();
		poly1.insert(7,4);
		poly1.insert(7.5f, 5);
		poly1.insert(5.5f, 2);
		poly1.insert(3.5f, 8);
		poly1.insert(2.2f, 7);

		poly1.display();
		
		Polynomial poly2= new Polynomial();
		poly2.insert(7,9);
		poly2.insert(7.4f, 6);
		poly2.insert(22.5f, 6);
		//Polynomial ploy3 = poly1.add_poly(poly2);
		//poly3.display();
		
		
		
	}




	private void insert(float co, int ex) {
		
		polyNode new_Node=new polyNode(co,ex);
		if((start == null )|| (ex>start.expo))
		{
			new_Node.next = start;
			start = new_Node;
			return;
		}
		
		polyNode it = start;
		while(it.next!= null&& it.next.expo>=ex)
		{
			it = it.next;
		}
		if(ex==it.expo)
		{
			it.coef = it.coef + co;
			return;
		}
		new_Node.next = it.next;
		it.next= new_Node;
		return;
	
	}
	
	public void display()
	{
		if(start == null)
		{
			System.out.println("Zero polynomial");
			return;
		}
		polyNode it = start;
		while(it!=null)
		{
			System.out.print(it.coef+"x^"+it.expo);
			it = it.next;
			if(it!=null)
			{
				System.out.print("	+	");
			}
			else
				System.out.print("\n");
		}
		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
