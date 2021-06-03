package Com;
import java.util.*;

public class Distance 
{
	public static void main(String[] args)
	{
		// parse x- and y-coordinates from command-line arguments
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		// compute distance to (0, 0)
		double dist = Math.sqrt(x*x + y*y);
		// output distance
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}   
}