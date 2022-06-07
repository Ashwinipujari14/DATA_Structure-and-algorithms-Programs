public class Stack {

	private int [] arr;
	private int top;

	public Stack()
	{
		this.arr = new int[0];
		this.top = -1;
	}
	public Stack(int size) 
	{
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int value)
	{
		//overflow condition
		if(this.top < this.arr.length-1)
		{
			this.top++;
			this.arr[this.top] = value;
		}
		else
			System.out.println("Overflow...");
	}
	
	public int pop()
	{
		if(this.top != -1)
		{
			int value = this.arr[this.top];
			this.top--;
			return value;
		}
		else
			System.out.println("Underflow...");
		return 0;
	}

	public String toString()
	{
		String str = "";
		if(this.top == -1)
			str = "Stack is empty";
		else
		{
			for(int i=this.top; i>=0; i--)
				str = str + (this.arr[i] + ", ");
		}

		return str;
	}

	public boolean equals(Stack x)
	{
		//s1.equals(s2)
		// s1 ==> this
		// s2 ==> x
		if(this.arr.length != x.arr.length)
			return false;

		if(this.top != x.top)
			return false;

		//iterate on both arr and check each element
		for (int i = 0; i < this.top; i++)
		{
			if(this.arr[i] != x.arr[i])
			{
				return false;
			}
		}
		return true;
	}
	public Stack concate(Stack a)
	{
		Stack res = new Stack(this.arr.length + a.arr.length);
		for(int i=0 ;i<=this.top ;i++)
		{
			res.push(this.arr[i]);
		}
		for(int i=0;i<=a.top;i++)
		{
			res.push(a.arr[i]);
		}
		return res;
	}
}