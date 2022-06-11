import java.util.Scanner;

public class MatrixMenu {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter how many number of rows and columns u want to enter in each matrix");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc. nextInt();
		int choice;
		do
		{
			System.out.println("Enter your choice :");
			System.out.println("\n1. Additon of two matrix ");
			System.out.println("\n2. Addition of diagonal elements");
			System.out.println("\n3. Addition of outer elements");
			System.out.println("\n4. Multiplication of matrix elements");
			System.out.println("\n5. Substraction of matrix elements");
			System.out.println("\n6. Division of matrix elements");
			
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				addition_2d_matrix( n, m);
				break;
			case 2 :
				addition_of_diagonal(n,m);
			
			
			}
			
		}while(choice !=7);
	}

	
	static void addition_of_diagonal(int n, int m)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);

	}
	
	
	public static void addition_2d_matrix(int n , int m)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of two matrix :");
		n = sc.nextInt();
		m = sc.nextInt();
		int twoarr[][]=new int[n][m];
		for(i=0;i<twoarr.length;i++)
		{
			for(j=0;j<twoarr[i].length;j++)
			{
				twoarr[i][j] = sc.nextInt();
			}
		}
		int twoarr1[][]=new int[n][m]; 
		for(i=0;i<twoarr1.length;i++)
		{
			for(j=0;j<twoarr1[i].length;j++)
			{
				twoarr1[i][j] = sc.nextInt();
			}
		}
		
		display_matrix(twoarr);
		display_matrix(twoarr1);
		
		int twoarr2[][]=new int[n][m]; 
		for(i=0;i<twoarr1.length;i++)
		{
			for(j=0;j<twoarr1[i].length;j++)
			{
				twoarr2[i][j] = twoarr[i][j] + twoarr1[i][j];
			}
		}
		display_matrix(twoarr2);
	}
	
	static void display_matrix(int [][]two)
	{
		int i,j;
		System.out.println("");
		for(i=0;i<two.length;i++)
		{
			for(j=0;j<two[i].length;j++)
			{
				System.out.print(two[i][j]);
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}

	
	
	
}
