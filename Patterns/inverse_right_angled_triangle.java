package Patterns;

public class inverse_right_angled_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5; // number of stars in 1st line 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i+1);j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
