import java.util.Scanner;

public class MenuStack {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first stack");
		int i = sc.nextInt();
		System.out.println("Enter size of second stack");
		int j = sc.nextInt();
		Stack s1 = new Stack(i);
		Stack s2 = new Stack(j);
		Stack s3 = new Stack();
		int choice;
		do
		{
			System.out.println("Enter Choice");
			System.out.println("1.push in stack 1");
			System.out.println("2.pop in stack 1");
			System.out.println("3.push in stack 2");
			System.out.println("4.pop in stack 2");
			System.out.println("5.check equality");
			System.out.println("6.Print stack 1");
			System.out.println("7.Print Stack 2");
			System.out.println("8.Concate two stacks s1 and s2");
			System.out.println("9.Print after concatenation Stack s3 is");
			System.out.println("10.exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter which element u want to print :");
				int a = sc.nextInt();
				s1.push(a);
				break;
				
			case 2 :
				s1.pop();
				break;
				
			case 3 :
				System.out.println("Enter which element u want to print :");
				int b = sc.nextInt();
				s2.push(b);
				break;
				
			case 4 :
				s2.pop();
				break;
				
			case 5 :
				boolean res =s1.equals(s2);
				if(res == true)
				{
				System.out.println("Elements are same");
				}
				else
				{
					System.out.println("Elements are diffrent");
				}
				break;
				
			case 6 :
				System.out.println(s1);
				break;
				
			case 7 :
				System.out.println(s2);
				break;
	
			case 8 :
				 s3 = s1.concate(s2);
				 break;
			case 9 :
				System.out.println(s3);
				 break;
			}
			
		}while(choice!=10);
	}
}
