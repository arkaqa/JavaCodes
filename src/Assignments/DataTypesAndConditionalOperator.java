package Assignments;

public class DataTypesAndConditionalOperator {

	public static void main(String[] args) {
		
		// WAP to print "Hello" on screen and then print your name on separate line
		
		System.out.println("Hello");
		System.out.println("Arka");
		System.out.println("----------------------------");
		// WAP to print the sum of two numbers 74+36
		int a=74;
		int b=36;
	    //int c=a+b;
	    System.out.println(a+b);
	    System.out.println("----------------------------");
	    // WAP to divide two numbers and print on screen 50/3
	    int q=50;
	    int p=3;
	    System.out.println(50/3);
	    System.out.println("----------------------------");
	    // WAP to print the results of following operations 
	    int o=5;
	    int i=8;
	    int u=6;
	    int y=55;
	    int z=9;
	    int l=20;
	    int s=-3;
	    int g=15;
	    int w=2;
	    int c=8;
	    int k=3;
	    System.out.println(-o+(i*u));
	    System.out.println((y+z)%z);
	    System.out.println(l+s*o/i);
	    System.out.println(o+g/p*w-c%k);
	    // WAP to compute the specific expressions and print the output
//	    ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//	    Expected Output
//	    2.138888888888889
	    
	    double flag= ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) ;
	    System.out.println(flag);
	    System.out.println("----------------------------");
//	    Try to concat "Hello Selenium" with a character 't'.
	    String c1= "Hello Selenium";
	    char c2='t';
	    System.out.println(c1 + c2);
	    System.out.println("----------------------------");
	    
//	    Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//	    	"Your Toal amount is. 3700".
	    
	    int a1=100;
	    int a2=200;
	    int a3=3400;
	    int a4=a1+a2+a3;
	    System.out.println(a4);
	    System.out.println("----------------------------");
	    byte b3 = 065; 
	    System.out.println(b3);
	    System.out.println("----------------------------");
	    
	    //Conditonal Operators:

//	    	1. Take three numbers from the user and print the greatest number. 
//
//	    	Test Data
//	    	Input the 1st number: 25 
//	    	Input the 2nd number: 78 
//	    	Input the 3rd number: 87
//	    	Expected Output :
//	    	The greatest: 87
	    	
	    int b1=25;
	    int b2=78;
	    int b4=87;
	    if(b1>b2 && b1>b4)
	    {
	    	System.out.println("b1 is the greatest number");
	    }
	    if(b2>b4)
	    {
	    	System.out.println("b2 is the greatest number");
	    }
	    else
	    {
	    	System.out.println("b4 is the greatest number");
	    }
	    System.out.println("----------------------------");
//	    2. Write a Java program to test a number is positive or negative.
//
//	    Test Data
//	    Input number: 35 -- positive number
//	    Input number: -11 -- negative number
	    
	    int l1=35;
	    int l2=-11;
	    if(l1>l2)
	    {
	    	System.out.println("l1 is a positive number and l2 is negative answer");
	    }
	    if(l2>l1)
	    {
	    	System.out.println("l2 is positive number and l1 is negative number");
	    }
	    System.out.println("------------END-------------");
	   
	    
	    
	}
		
}
	
	