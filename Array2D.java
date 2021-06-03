package Com;
import java.util.*;

public class Array2D
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row");
		int m = sc.nextInt();
		System.out.println("Enter Column");
		int n = sc.nextInt();
		int ar[][] = new int[m][n];
		//Taking the elements from user
		System.out.println("Enter the Array ELements");
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				ar[i][j] = sc.nextInt();
			}
		}
		// printing 2 dimensional array 
		System.out.println("The Elements Of an Array are");
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.print(ar[i][j]+ " ");
			}
		}
	}
}