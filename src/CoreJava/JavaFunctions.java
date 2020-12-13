package CoreJava;

public class JavaFunctions {

	public static void main(String[] args) {
		//WAP to get the capitalName of a country
		
		JavaFunctions obj=new JavaFunctions();
		String v=obj.getCapitalName("USA");
		System.out.println(v);
		
		
		
		

	}
	
public String getCapitalName(String countryName){
		
		//System.out.println("getting capital name for " + countryName);
		
		String capital=null;
		if(countryName.equals("India")){
			capital="New_Delhi";
		}
		
		else if(countryName.equals("USA")){
			capital="DC";
		}
		
		else if(countryName.equals("UK")){
			capital="London";
		}
		return capital;
		
		
		
	}
}
