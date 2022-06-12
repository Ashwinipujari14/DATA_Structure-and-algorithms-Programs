public class Queue {
	int []arr;
	int front;
	int rear;
	
	public Queue() {
		arr = new int [5];
		front =-1;
		rear = -1;
	}
	public void insert(int value)
	{
		//full condition
		if(rear<arr.length-1)
		{
		rear ++;
		arr[rear]=value;
		
		if(front == -1)
		{
			front ++;
		}
		}
		else
			System.out.println("Queue is Full");
	}
	
	public int remove()
	{
		int value =0;
		if(front != -1)
		{
		value = arr[front];
		if(front != rear)
		{
		front++;
		}
		else
			front =rear - 1;
		}
		else 
			System.out.println("queue is empty...");
		return 0;
		
	}
	public String toString() {
		String str ="";
		if(front == -1)
		{
			str = "Queue is empty";
		}
		else
		{
			for(int i = front ; i<= rear ;i++)
			{
				str += arr[i] + ",";
			}
		}
		return  str;
	}
	
	

}
