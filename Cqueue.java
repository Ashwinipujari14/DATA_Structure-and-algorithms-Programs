
public class Cqueue {
	int []arr;
	int front;
	int rear;
	
	public Cqueue() {
		this.arr = new int [5];
		this.front =-1;
		this.rear = -1;
	}
	public Cqueue(int size)
	{
		this.arr = new int [size];
		this.front =-1;
		this.rear = -1;
	}
	public void insert(int value)
	{
		//full condition
		
		if((this.rear+1 == this.front) || (this.rear == this.arr.length -1 && this.front ==0))
		{
				System.out.println("Queue is full");
				return ;
		}
		else 
		{
			if(this.rear != this.arr.length-1)
				this.rear ++;
			else 
				this.rear =0;
		}
		//this.arr[this.rear]=value;
		if(front ==-1)
		{
			this.front ++;
		}
		//System.out.println(this);
		arr[rear]=value;
	}
	
	public void remove()
	{
		int value =0;
		if(this.front == -1)
		{
			System.out.println("Queue is empty");
		}
		else
			{
			//value = arr[front];
			if(this.front != this.rear)
			{
				if(this.front !=this.arr.length-1)
					this.front++;
				else 
					this.front =0;
			}
			}
			/*else
			front = rear = -1; 
			}*/
		//return value;
		
	}
	public String toString() {
		String str ="";
		if(this.front == -1)
		{
			str = "Queue is empty";
		}
		else
		{
			for(int i = this.front ; i!= this.rear ;)
			{
				str += this.arr[i] + ",";
				if(i!= this.arr.length-1)
				{
					i++;
				}
				else
				{
					i=0;
				}
			}
			str = str + this.arr[this.rear] ;
		}
		return  str;
	}
}
