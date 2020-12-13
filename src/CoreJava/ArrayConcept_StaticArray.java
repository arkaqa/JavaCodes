package CoreJava;

public class ArrayConcept_StaticArray {

	public static void main(String[] args) {
		
		int a[]=new int[2];
		a[0]=20;
		a[1]=30;
		//i[2]=40;
		System.out.println(a[1]);
		System.out.println("-------------------");
		
		String b[]= new String[2];
		b[0]="Arka";
		b[1]="Avra";
		System.out.println(b[1]);
		System.out.println("-------------------");
		for(int l=0; l<b.length; l++)
		{
			System.out.println(b[l]);
		}
		System.out.println("-------------------");
		String c[]=new String[4];
		c[0]="ABCD";
		c[1]="dr tarun mandal";
		c[2]="Delhi";
		c[3]="Kolkata";
		System.out.println(c[2]);
		System.out.println(c.length);
		int ab = c.length-1;
		System.out.println(ab);
		System.out.println("-------------------");
		for(int l=0; l<c.length; l++)
		{
			System.out.println(c[l]);
		}
		System.out.println("-------------------");
		Object d[]= new Object[5];
		d[0]="Arka Mandal";
		d[1]=26;
		d[2]="Software Engineer";
		d[3]='M';
		d[4]="2 years experience in QA domain";
		for(int i=0; i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		System.out.println("--------FOR EACH LOOP-----------");
		for(Object flag: d)
		{
			System.out.println(flag);
		}
		
		Object d1[]= new Object[2];
		d1[0]="TATA MANZA";
		d1[1]=10;
		int i=0;
		while(i<d1.length)
		{
			System.out.println(d1[i]);
			i++;
		}
		
		int q[]= {10,20};
		System.out.println(q[8]);
		
				
	}

}
