package Com;

import java.util.Scanner;

public class WindChill 
{
	public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);
        // get command-line arguments
    	System.out.println("Enter the numbers");
        double t = sc.nextDouble(); // temperature (F)
        double v = sc.nextDouble(); // velocity of wind (mph)
 
        // careful to add all three * signs:
        double windChillTemp = 35.74 + 0.6215 * t +
                    (0.4275 * t - 35.75) * Math.pow(v, 0.16);
 
        // print the result
        System.out.println(windChillTemp); // windchill (F)

    }
}
