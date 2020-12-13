package CoreJava;

public class test {

	public static void main(String[] args) {
		
		String s="Ja va dev el o per";
		//s=s.replaceAll("[^a-z]");
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		

	}

}
