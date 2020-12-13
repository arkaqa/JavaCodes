package CoreJava;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(968);
		a.add(111);
		a.add(234);
		a.add(462);
		a.add(321);
		a.add(222);
		a.add(233);
		a.remove(6);
	
		
		for(int i = 0;i<a.size();i++)
		{
			System.out.print(a.get(i)+ " ");
		}
		System.out.println();
		// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> b=new ArrayList<String>();
		b.add("White");
		b.add("Yellow");
		b.add("Brown");
		b.add("Black");
		b.add("Safron");
		b.add("Pink");
		b.add("Blue");
		b.add("Red");
		b.add("Green");
		b.add("Orange");
		b.add("SkyBlue");
		b.add("Gray");
		b.add("Ash");
		for(int i=0; i<b.size();i++)
		{
			System.out.print(b.get(i)+ " ");
		}
		System.out.println();
		
		//2. Write a Java program to insert an element into the array list at the first and last positions.
		
		ArrayList<String> c=new ArrayList<String>();
		c.add("Arko");
		c.add("");
		c.add("");
		c.add("Mandal");
		for(int i=0; i<c.size();i++)
		{
			System.out.print(c.get(i)+ " ");
		}
		System.out.println();
		
		//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		ArrayList<Character> d= new ArrayList<Character>();
		d.add('A');
		d.add('B');
		d.add('C');
		d.add('D');
		System.out.println(d.get(3));
		
		// 4. Write a Java program to update specific array element by given element.
		
		
		
		
		

	}

}
