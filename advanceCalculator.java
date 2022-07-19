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