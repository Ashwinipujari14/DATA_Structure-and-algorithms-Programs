
public class Main {

	public static void main(String[] args) {
	
		Binary b = new Binary(10);
		
		b.accept();
		b.bin_search(21);
		int pos =  b.bin_search(21);
		if(pos!=-1)
		{
			System.out.println("Found at "+pos+" position");

		}
		else
		{
			System.out.println("Not found");
		}

	}

}
