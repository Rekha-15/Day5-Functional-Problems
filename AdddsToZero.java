package Com;
import java.util.*;

public class AdddsToZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int a[] = new int[n];
		//taking array elements from user
		System.out.println("Enter Array Elements");
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		//checking the sum of three numbers is equal to 0
		for(int i = 0; i< n-2; i++) {
			for(int j = i + 1; j < n-1; j++) {
				for(int k = j + 1; k < n; j++) {
						if(a[i] + a[j] + a[k] == 0) {
							System.out.println(a[i]+ " " + a[j] + " " + a[k]);
							}
					}
				}
			}
		}
    }