package Assignments;

public class StringManipulation {

	public static void main(String[] args) {
		
//		  Write a program to check two different strings equality.
		String a="Hello!!! This is my first code";
		String b="Hello!!! This is my first code";
		if(a.equals(b))
		{
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		System.out.println("-------------------");
		
//		 Remove all  spaces in a String . 
//		 
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		
		String c="         Hello      Everyone       ";
		String Tester = c.trim().replace("      ", "");
		System.out.println(Tester);
		System.out.println("-------------------");
		
//		 Write a program that will  print out the last character and first character of a word.
		
		String d="Hello";
		
		
		System.out.println("-------------------");
//		Write a program to verify a word or a character contained in the sentence.
		
		String e="I got a iphone11 pro";
		if(e.contains("iphone11"))
		{
			System.out.println("Correct String");
		}
		else
		{
			System.out.println("Incorrect string");
		}
		System.out.println("-------------------");
		//Write a function/ method to reverse your own name.
		
		 String str = "Arka";
		StringBuilder sb=new StringBuilder(str);  
		    StringBuilder q = sb.reverse(); 
		    System.out.println(q);
		    System.out.println("-------------------");
//		    Write a program that gives you the last half of the string.
		    
		    String f="Android";
		    String test = f.substring(4);
		    System.out.println(test);
		    System.out.println("-------------------");
//		    Write a program that gives you the last half of the string.
		    
		    String a1="Welcome's to Naveen Automation Labs ! ";
		    System.out.println(a1.indexOf("e", a1.indexOf("e")+6));
		    System.out.println("-------------------");
//		    Write a method which gives an index of (-1) if string is not available. . it should return integer. 
//		    if String is present, then it should return the specific index.
		    
		    String a2="Hello Arka...";
		    int test1 = a2.indexOf("i");
		    System.out.println(test1);
		    System.out.println("-------------------");
//		    Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
		    
		    String details="ABC_264_QATester_WebTesting_MobileTesting_Selenium";
		    String[] lang = details.split("_");
		    int abc = lang.length;
		    System.out.println(abc);
		    for(int i=0;i<lang.length;i++)
		    {
		    	System.out.println(lang[i]);
		    }
		    
		   
		    
		    
		    
		
		
		
		
	}

}
