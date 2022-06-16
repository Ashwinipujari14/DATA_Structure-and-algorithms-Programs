package date11;

import date11.charStack.Node;

public class charStack1 {

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
	//c34*+2+ stack = 16
	//23+42+* stack = 23 ==>5 ,4, 2 ==> 5,6 ==>30
	/*int eval_post(String post)
	{
		charStack st = new charStack();
		int a,b,temp,result;
		int i;
		char []p= post.toCharArray();
		for(i=0;i<p.length;i++)
		{
			if(p[i]>='0' && p[i]<='9')
			{
				st.push(p[i] - 48);
			}
			else
			{
				if(!st.isEmpty())
				{
					a=st.pop();
				}
				if(!st.isEmpty())
				{
					b=st.pop();
				}
				switch(p[i])
				{
				case '+' :
					temp=b+a;
					break;
					
				case '-':
					temp=b-a;
					break;
					
				case '*':
					temp = b*a;
					break;
				case '/':
					temp =b/a;
					break;
					
				case '%' :
					temp = b%a;
					break;
					
				case '^' :
					temp=pow(b,a);
					break;
				}
				st.push(temp);
			}//end of else
		}//end of for
		result = st.pop();
		return result;
	}
	*/
	
	public static void main(String[] args) {

		//ValidExp ve;
		charStack1 s = new charStack1();
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
		
		String exp1 = new String ("2+3*4+5");
		String a =infix_to_prefix(exp1);
		System.out.println(a);

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

	static String infix_to_prefix(String infix)
	{
		
		charStack st = new charStack();
		int i,p=0;
		char symbol,next;
		char post[] = new char[infix.length()];
		//just for precaution and system utilization
		//as system set the null character at end 
		//we use length+1 at the array size
		//for(i=0;i<infix.length();i++)
		
		for(i=infix.length()-1;i>=0;i--)

		{
			symbol=infix.charAt(i);
			if(symbol!=32)
			{
				
				switch(symbol)
				{
				case ')':
					st.push(symbol);
					break;

				case '(':
					while((next=st.pop())!=')')
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
					while(!st.isEmpty() && prec(st.peek())>prec(symbol))
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
		char[] p1 = new char[infix.length()+1];
		p1=post;
		int start=0;
		int end =p1.length-1;
		while(start<=end)
		{
			char temp = p1[start];
			p1[start]=p1[end];
			p1[end]=temp;
			start++;
			end--;
		}
		
		String postfix = new String (p1);
		return postfix;
	}


}//end of classs
