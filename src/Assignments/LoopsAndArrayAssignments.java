package Assignments;

public class LoopsAndArrayAssignments {

	public static void main(String[] args) {
//		1. WAP to print following output:
//			I am Batman- 5 times
		String st="I am Batman";
		for(int i = 0;i<5;i++)
		{
			System.out.println(st);
		}
		System.out.println("--------------------------");
		String st1="I am Batman";
		for(int i=1;i<=9;i++)
		{
			System.out.println(st1 +" "+i);
		}
//		WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("--------------------------");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i=i-1;
		}
		System.out.println("--------------------------");
		int m=10;
		do
		{
			System.out.println(m);
			m--;
		}
		while(m>=1);
		System.out.println("--------------------------");
//		Write a program in Java to print "Hello World" ten times using while loop
		
		String flag="Hello World";
		while(i<10)
		{
			System.out.println(flag);
			i++;
			
		}
		System.out.println("--------------------------");
//		Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		int s1=1;
		while(s1<7)
		{
		System.out.println(s1);
		s1++;
		}
		System.out.println("--------------------------");
//		Array Assignment:

//			Question 1: Write a program to print the following pattern using for loop:
		
//		00 01 02 03 04 05 06 07 08 09 
//		10 11 12 13 14 15 16 17 18 19 
//		20 21 22 23 24 25 26 27 28 29 
//		30 31 32 33 34 35 36 37 38 39 
		
		String i1[]= new String[4];
		i1[0]="00 01 02 03 04 05 06 07 08 09";
		i1[1]="10 11 12 13 14 15 16 17 18 19";
		i1[2]="20 21 22 23 24 25 26 27 28 29";
		i1[3]="30 31 32 33 34 35 36 37 38 39";
		for(int i2=0; i2<i1.length; i2++)
		{
			System.out.println(i1[i2]);
		}
		System.out.println("--------------------------");
//		Question 2: Write a program to create a static Array, having following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
		
		Object ob[]=new Object[6];
		ob[0]="Arka";
		ob[1]=20;
		ob[2]="Kolkata";
		ob[3]="12/02/20";
		ob[4]='M';
		ob[5]=90;
		
		for(int k=0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
		System.out.println("--------------------------");
		
		Object ob1[]=new Object[6];
		ob1[0]="Avra";
		ob1[1]="30";
		ob1[2]="12/12/90";
		ob1[3]='M';
		ob1[4]=50;
		ob1[5]="Chennai";
		for(int a=0;a<ob1.length;a++)
		{
			System.out.println(ob1[a]);
		}
		System.out.println("--------------------------");
//		Question 3: Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0
		String ob2[]=new String[5];
		ob2[0]="n = 4";
		ob2[1]="n = 3";
		ob2[2]="n = 2";
		ob2[3]="n = 1";
		ob2[4]="n = 0";
		for(int s = 0;s<ob2.length;s++)
		{
			System.out.println(ob2[s]);
		}
		
		
		
				

	}

}
