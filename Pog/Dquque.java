
public class Dquque {
private int [] arr;
private int F;
private int R;
public Dquque()
{
	this.arr=new int [5];
	this.F=-1;
	this.R=-1;
}
public Dquque(int size) 
{
	this.arr = new int[size];
	this.F=-1;
	this.R=-1;
	
}


public void insert_F(int value)
{
	if(F==0 && R==arr.length-1)
	{
		System.out.println("full");
	}
	else
	{
		//check if this is the first value
		if(F==-1)
		{
			F=R=0;
		}
		//check if th
		else if(F!= 0)
		{
			F--;
			
		}
		else
		{
			R++;
			//shift all values by 1 place
			for(int x=R; x>F ;x--)
			{
				arr[x] = arr[x-1];
			}
		}
		arr[F] = value;
	}
}

public void insert_R(int value)
{
	
	if(F==0 && R==arr.length-1)
	{
		System.out.println("full");
	}
	else
	{
		if(F==-1)
		{
			F=R=0;
		}
		else if(R!=arr.length-1)
		{
			R++;
			
		}
		else
		{
			F--;
			for(int x=F; x<R ;x++)
			{
			arr[x] = arr[x+1];
		
			}
			
		}
		arr[R]=value;
		}
	}
	
	public String toString()
	{	String str ="";
	if(this.F == -1)
	{
		str = "Queue is empty";
	}
	else
	{
		for(int i = this.F ; i<= this.R;i++)
		{
			str += arr[i] + ",";
		}
	}
	return  str;
	}
}
