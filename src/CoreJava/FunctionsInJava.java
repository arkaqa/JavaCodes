package CoreJava;

public class FunctionsInJava {
	
	

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		obj.browserTestMethod();
		
		FunctionsInJava Q= new FunctionsInJava();
		Q.automationCases();
		Q.browserTestMethod();
		Q.printName();
		
		FunctionsInJava obj2=new FunctionsInJava();
		obj2.manualCases();
		obj2.qa();
		obj2.w3C();
	    int s1=obj2.updateTestCases(10,20);
	    System.out.println("Some input some return "+s1);
	    int s2=obj2.additionMethod();
	    System.out.println("No input, some return "+s2);
		FunctionsInJava obj3=new FunctionsInJava();
		obj3.automationCases();
		
		

	}
	
	public void test() {
		System.out.println("Test Method");
	}
	public void printName() {
		System.out.println("Print your name");
	}
	public void browserTestMethod() {
		System.out.println("Browser should be launched");
	}
	public void w3C() {
		System.out.println("Test and update the results");
	}
	public void qa() {
		System.out.println("QA production work");
	}
	public void automationCases() {
		System.out.println("Write automation testcases");
	}
	public void manualCases() {
		System.out.println("Write manual testcases");
	}
	public int updateTestCases(int a,int b) {
		int AllTotal = a+b;
		return AllTotal;
	}
	public int additionMethod() {
		int c=200;
		int d=300;
		int e=c+d;
		return e;
	}

}
