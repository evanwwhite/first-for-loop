// Evan White
import java.util.Scanner;
public class FirstForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a Start Value: ");
		int start = input.nextInt();
		
	    System.out.println("Input a End Value: ");
	    int end = input.nextInt();
	    
	    System.out.println("Input a Step Value: ");
	    int step = input.nextInt();
	    
		for (int i = start; i < end; i += step)
		{
			System.out.println(i + " ");
		}
	}

}
/*
Input a Start Value: 
1
Input a End Value: 
100
Input a Step Value: 
10
1 
11 
21 
31 
41 
51 
61 
71 
81 
91 
*/
