package Functions_and_Methods;

import java.util.Scanner;

public class qs2 {

	
	public  static boolean iseven(int g)
	{
		if(g%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		
		if(iseven(a)==true)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
		
		
		
	}

}
