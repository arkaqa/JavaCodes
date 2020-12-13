package CoreJava;

public class ConditionalOperator {

	public static void main(String[] args) {
		
//		int a=20;
//		int b=30;
//		System.out.println(a>b);
//	
//		if (a>b)
//		{
//			System.out.println("a is greater than b");
//		}
//		else
//		{
//			System.out.println("b is greater than a");
//		}
//
//	
//	
//	// Condition checking for Strings
//	
//	String s="Avro";
//	String flag="QA";
//	if(s.equals(flag))
//	{
//		System.out.println("s and flag both are equal");
//	}
//	else
//	{
//		System.out.println("both are not equal");
//	}
//	
//	// Examples
//	int balance=101;
//	if(balance!=100)
//	{
//		System.out.println("balance is not corrent");
//	}
	
	// Example 2
	int marks=89;
	if(marks>=90)
		if (marks <= 100)
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("wrong marks");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	// WAP to find the highest of 3 numbers
	
	int t= 24;
	int o=44;
	int l=99;
	if (t>o && t>l)
	{
		System.out.println("t is the highest number");
	}
	if(o>l)
	{
		System.out.println("o is the highest number");
	}
	else
	{
		System.out.println("l is the higesht number");
	}
	
	// With if else condition
	
	String browser="xpath";
	if(browser.equals("chrome")) {
		System.out.println("Launch chrome");
		
	}
	if(browser.equalsIgnoreCase("xPath"))
	{
		System.out.println("Launch Xpath");
	}
	else
	{
		System.out.println("Wrong Browser name");
	}
	
	// Switch Case
	
	String SAP="DAS";
	switch (SAP){
		case "DAS":
			System.out.println("Launch DAS");
			break;
		case "SAFARI":
		     System.out.println("CONGRATS");
		    break;
		case "DOLAS":
		     System.out.println("FALSE");
		    break;
		default:
		    System.out.println("Wrong SAP name");
		    	
		
	}

	
	
 }
}




