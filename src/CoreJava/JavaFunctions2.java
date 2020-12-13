package CoreJava;

public class JavaFunctions2 {

	public static void main(String[] args) {
		JavaFunctions2 obj1=new JavaFunctions2();
		int v = obj1.getStudentMarks("a rkaa");
		System.out.println(v);
		 v = obj1.getStudentMarks("rafdno");
		System.out.println(v);
		

	}
	
	public int getStudentMarks(String Name)
	{
		int marks=0;
		if(Name.equalsIgnoreCase("Arkaa")) {
			marks=99;
		}
	    else if(Name.equalsIgnoreCase("Avra")) {
			marks=70;
		}
		else if(Name.equalsIgnoreCase("Rano")) {
			marks=90;
		}
		else if(Name.equalsIgnoreCase("Showvik")) {
			marks=40;
		}
		else if(Name.equalsIgnoreCase("Saha")) {
			marks=59;
		}
		else {
			System.out.print("Please enter correct name ");
			marks=-1;
		}
		return marks;
		
	}

}
