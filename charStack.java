package date11;

public class charStack {

	Node top;
	static class Node{//inner class //generally static 
		//scope within charstack visibility 
		char data;
		Node next;
		Node( char d)
		{
			data =d;
			next = null;
		}
	}
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
			return false;
	}
	public char peek()
	{
		if(top==null)
		{
			return '*';
		}
		else
			return top.data;
	}
	public void push(char d)
	{
		Node new_node = new Node(d);
		if(top==null)
		{
			top = new_node;
		}
		else
		{
			new_node.next=top;
			top=new_node;
		}
	}
	public char pop()
	{
		char data;
		data = top.data;
		top = top.next;
		return data;
	}

	//Logic is important , not about time or speed
	/*Traverse expr char by char ,
	 *  if char is opening parentheses ,then push it into stack 

	 *  if char is closing parenthesis then we will pop char from stack 
	 *   we will check popped char with current char (closing). let us write a different 
	 	function for matching the parenthesis() {} []

	stack= {  (
	 */

	boolean match (char a,char b)
	{
		if(a=='[' && b==']'  || a=='{' && b=='}' || a=='(' && b==')')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean check(String exp)//"{9+(8*5)-3}"
	{
		int i;
		char temp;
		for(i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='('|| exp.charAt(i)=='{' || exp.charAt(i)=='[')
			{
				push(exp.charAt(i));
			}
			if(exp.charAt(i)==')'|| exp.charAt(i)=='}' || exp.charAt(i)==']')
			{
				if(top == null)//stack empty
				{
					System.out.println("Right Paranthesis are more.....");
					return false;
				}
				else
				{
					temp = pop();
					if(!(match(temp , exp.charAt(i))))
					{
						System.out.println("Mismatch paranthesis");
						System.out.println(temp+"  " +exp.charAt(i));
						return false;
					}
				}

			}
		}
		if(top == null)
		{
			System.out.println("Balanced....");
			return true;
		}
		else
		{
			System.out.println("Left paranthesis are more...");
			return false;
		}
	}


	int pow(int n, int m)
	{
		int p=1,i;
		for(i=1;i<=m;i++)
		{
			p=p*n;
		}
	return p;
	}
	
	
	public static void main(String[] args) {

		//ValidExp ve;
		charStack s = new charStack();
		String exp = new String ("{9+(8*5)-3}");
		if(s.check(exp))
		{
			System.out.println(" yes");
		}
		else
		{
			System.out.println(" no ");
		}
		
		//Hats off to mam
		//Khatarnaak Logic 
		//have to build such type of logic
	//	String exp1 = new String("A+B*C+D");
	//	String exp1 = new String("A*B+C*D");
	//	String exp1 = new String("(A+B)*(C+D)");
		System.out.println("Infix :"+"2+3 * 4+5 ");
		String exp1 = new String ("2+3 * 4+5 ");
		String a =infix_to_postfix(exp1);
		//int res = eval_post(a);
		System.out.println("Postfix :"+a);

	}//end of main

	public static int prec(char symbol)
	{
		switch(symbol)
		{
		case '(' :
			return 0;	
		case '+'://operator having same precedence
		case '-'://it working as a or for cases 
			return 1;

		case '*':
		case '/':
		case '%':
			return 2;

		case '^':
			return 3;

		default :
			return 0;		
		}
	}

	static String infix_to_postfix(String infix)
	{
		charStack st = new charStack();
		int i,p=0;
		char symbol,next;
		char post[] = new char[infix.length()+1];
		//just for precaution and system utilization
		//as system set the null character at end 
		//we use length+1 at the array size
		for(i=0;i<infix.length();i++)
		{
			symbol=infix.charAt(i);
			if(symbol!=32)
			{
				switch(symbol)
				{
				case '(':
					st.push(symbol);
					break;

				case ')':
					while((next=st.pop())!='(')
					{
						post[p++]=next;
					}
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while(!st.isEmpty() && prec(st.peek())>=prec(symbol))
					{
						post[p++]=st.pop();
					}
					st.push(symbol);
					break;
				default:
					//if symbol is operand
					post[p++]=symbol;
				}
			}
		}//end of for
		

		while(!st.isEmpty())
		{
			post[p++] = st.pop();
		}
		
		String postfix = new String (post);
		return postfix;


	}





}//end of classs
