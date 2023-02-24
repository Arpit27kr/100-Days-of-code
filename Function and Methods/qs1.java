// program for calculation of average
package Functions_and_Methods;

import java.util.Scanner;

public class qs1 {
	
	public static int average(int s, int b, int c)
	{
		int av =(s+b+c)/3;
		return av;
	}
	
	
	
	public static void main()
	{
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int av = average(a,b,c);

		
	}
	
	

}
