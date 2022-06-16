package date11;

public class StringStack {

		Node top;
		static class Node{
			String data;
			Node next;
			Node( String d)
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
		public String peek()
		{
			if(top==null)
			{
				return "*";
			}
			else
				return top.data;
		}
		public void push(String d)
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
		public String pop()
		{
			String data;
			data = top.data;
			top = top.next;
			return data;
		}
		public static void main(String[] args) {
			
			StringStack s = new StringStack();
			String expr = new String("ABC*+D+");
			String res =postfix_to_prefix(expr);
			System.out.println(res);
			
			System.out.println("********");
			String newres = prefix_to_postfix(res);
			System.out.println(newres);
			
			
		}
		public static String prefix_to_postfix(String post)
		{
			String op1,op2,str,temp;
			char symbol;
			int i;
			StringStack st = new StringStack();
			char p[]= post.toCharArray();
			//for(i=0;i<post.length();i++)
				for(i=post.length()-1;i>=0;i--)
			{
				symbol=p[i];
				temp = new String (Character.toString(symbol));
				
				if(symbol!=32)
				{
					switch(symbol)
					{
					case '+':
					case '-':
					case '*':
					case '/':
					case '%':
					case '^':
					
						op1 = new String(st.pop());
						op2 = new String(st.pop());
						str = new String (op1).concat(op2).concat(temp);
					st.push(str);
					break;
					
					default:st.push(temp);

					}//switch end
					}//if
				}//for end
			
		return (st.pop());
	}//end of function
		public static String postfix_to_prefix(String post)
		{
			String op1,op2,str,temp;
			char symbol;
			int i;
			StringStack st = new StringStack();
			char p[]= post.toCharArray();
			for(i=0;i<post.length();i++)
			{
				symbol=p[i];
				temp = new String (Character.toString(symbol));
				
				if(symbol!=32)
				{
					switch(symbol)
					{
					case '+':
					case '-':
					case '*':
					case '/':
					case '%':
					case '^':
					
						op1 = new String(st.pop());
						op2 = new String(st.pop());
						str = new String (temp).concat(op2).concat(op1);
					st.push(str);
					break;
					
					default:st.push(temp);

					}//switch end
					}//if
				}//for end
			
		return (st.pop());
	}//end of function
}



