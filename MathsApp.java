package day1;

import java.util.Scanner;

public class MathsApp 
{
	public static void main(String[]args)
	{
		MathsApp app=new MathsApp();
		Mathall m1=app.acceptData();
		int choice=app.selectOption();
		app.operations(choice,m1);
		while(choice!=11)
		{
			choice=app.selectOption();
			app.operations(choice,m1);
		}
	}
	public Mathall acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Mathall m1=new Mathall(a,b);
		return m1;
	}
	public int selectOption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maths operation to perform.\n 1.Addition 2. Substration \n 3.Multiplication "
				+ "4.Division \n 5.Swap numbers 6.modulus \n 7.Nth power of number 8.table \n 9.square 10.cube \n 11.stop");
		int optn=sc.nextInt();
		return optn;
	}
	public void operations(int c,Mathall m1)
	{
		switch(c)
		{
		case 1:
			int a=m1.sum(m1.num1,m1.num2);
			System.out.println("Addition of two numbers is:"+a);
			break;
		case 2:
			a=m1.sub(m1.num1,m1.num2);
			System.out.println("Substraction of two numbers is:"+a);
			break;
		case 3:
			a=m1.mul(m1.num1,m1.num2);
			System.out.println("Multiplication of two numbers is:"+a);	
			break;
		case 4:
			float d=m1.div(m1.num1,m1.num2);
			System.out.println("Division of two numbers is:"+d);
			break;
		case 5:
			m1.swap(m1.num1,m1.num2);	
			break;
		case 6:
			d=m1.mod(m1.num1,m1.num2);
			System.out.println("Modulus of two numbers is:"+d);	
			break;
		case 7:
			d=m1.pow(m1.num1,m1.num2);
			System.out.println(+m1.num2+" power of" +m1.num1+"is " +d);
			break;
		case 8:
			m1.table(m1.num1);
			m1.table(m1.num2);
			break;
		case 9:
			m1.square(m1.num1);
			m1.square(m1.num2);
			break;
		case 10:
			m1.cube(m1.num1);
			m1.cube(m1.num2);
			break;
		default:
			System.out.println("Application closed");
		}

	}

}
