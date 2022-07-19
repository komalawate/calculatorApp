package day1;

public class Mathall 
{
	int num1,num2;
	public Mathall()
	{
		System.out.println("You have not entered number ");	
	}
	public Mathall(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public float div(int a,int b)
	{
		return a/b;
	}
	public void swap(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped value of a is "+a+" Swapped value of b is "+b);
	}
	public float mod(int a,int b)
	{
		return a%b;
	}
	public float pow(int a,int b)
	{
		int i=0;
		 boolean x=odd_even(b);
		 if (x==true)
		 {
		 while(i<(b/2))
		{
			a=a*a;
			i++;
		}
		 return a;
		 }
		 else
		 {	 while(i<(b/2))
				{
					a=a*a;
					i++;
				}
				 
		 		return a*b;
		 }
		
	}
	
	public boolean odd_even(int x)
	{
		if(x%2==0)
			return true;
		else 
			return false;
	}
	
	public void table(int a)
	{
		int n=1;
		int t=0;
		while(n!=11)
			{
			t=n*a;
			System.out.println(+a+"*"+n+"="+t);
			n=n+1;
			}
	}
	public void square(int a)
	{
		int sq=a*a;
		System.out.println(+sq);
	}
	public void cube(int a)
	{
		int cube=a*a*a;
		System.out.println(+cube);
	}
}
