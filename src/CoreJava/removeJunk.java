package CoreJava;

public class removeJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Selenium4.0";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		
		String fe="Falcon Eye";
		StringBuffer sf=new StringBuffer(fe);
		System.out.println(sf.reverse());
	}

}
