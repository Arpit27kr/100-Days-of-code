package Functions_and_Methods;

import java.util.Scanner;

public class qs4 {
	
	
	public static void smallest (int a,int b , int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a+" is great");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is great");
		}
		else
		{
			System.out.println(c+" is great");
		}
		
	}
	
	public static void middle(String aa , int l)
	{
		
		
		int mid=l/2;
		if(l%2==0)
		{
			if(mid>2)
			{
			System.out.println(aa.charAt(mid) +" and " + aa.charAt(mid+1)+"are mid elements ");
			}
			else 
			{
				System.out.println(aa.charAt(mid-1) +" and " + aa.charAt(mid)+"are mid elements ");
				
			}
		}
		else
		{
			System.out.println(aa.charAt(mid));
		}
		
		

		
		
	}
	public static void strmid(String str,int l)
	{
		int mid=l/2;
		if(mid>2)
		{
		System.out.println(str.charAt(mid) +" and " + str.charAt(mid+1)+"are mid elements ");
		}
		else 
		{
			System.out.println(str.charAt(mid-1) +" and " + str.charAt(mid)+" are mid elements ");
			
		}
		
		
	}
	
	
	
	public static int  count(String str,int l )
	{
		int n=0;
		int count=0;
		while(n<l)
		{
			count++;
			n++;
		}
		return count;
	}
	
	
	public static int countvowel(String ch)
	{
		int count=0;
		char ch1[]= {'a','e','i','o','u'};
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u')
			{
				count++;
			}
			
		}
		return count;
	}
	
	
	public static void sumdig(int x)
	{
		int sum=0;
		while(x>0)
		{
			int t=x%10;
			sum=sum+t;
			x=x/10;
			
			
		}
		System.out.println(sum);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		
		
		
		System.out.println("------------_____________CONSOLE______________________--------------");
		
		System.out.println("Press 1 for greatest number");
		System.out.println("press 2 for middle element ");
		System.out.println("press 3 for middle character");
		System.out.println("Press 4 for count words ");
		System.out.println("Press 5 for counting vowels ");
		System.out.println("Press 6 for sum of the digits ");
		
		System.out.println("------------_____________CONSOLE______________________--------------");
		
		int z=input.nextInt();
		
	
		
		while(z!=7)
		{
		
		if(z==1)
		{
		
		int a=input.nextInt();  // initialize
		int b=input.nextInt();
		int c=input.nextInt();		
		// 1.  for smallest
		
		smallest(a,b,c);
		}
		
		// 2.  middle character
		else if(z==2)
		{
		 String aa=input.next();
		 int l=aa.length();
		 middle(aa,l);
		
		
		}
		// 3.  print middle element
		else if(z==3)
		{
			String str=input.next();
			int l=str.length();
			strmid(str,l);
			
		}
		
		
		//4.  count vowels
		
		else if (z==4)
		{
			String str2=input.next();
			int count=countvowel(str2);
			System.out.println(count);
			
		}
		
		
		//5.  count words in string 
		else if(z==4)
		{
			String str=input.next();
			int l=str.length();
			int t=count(str,l);
			System.out.println(t);
		}
		
		
		//6.  sum of digits
		
		if(z==6)
		{
		int x=input.nextInt();
		sumdig(x);
		}
		
		
		}
	}

}
