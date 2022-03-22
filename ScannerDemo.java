package tamilnadu.tenkasi;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerDemo sd = new ScannerDemo();
		sd.getInputFromUser();
	}

	private void getInputFromUser() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter number");
		int i = sc.nextInt();
		System.out.println(i+10);*/
		int total = 0;
		int sub = 5;
		
		float totalvalue =0;
		float subject = 6;
		String Name = "muthukumar";
		String Name2 = "kumar";
		long longvalue = 0;
		double doublevalue = 0;
		while(sub>0)
		{
			System.out.println("what is your name ?");
			String name = sc.nextLine();
		    System.out.println("my name is :"+Name);
		    sub--;
			
		    System.out.println("Enter Mark");
			int m1 = sc.nextInt();
			total = total + m1;
			sub--;
			
			System.out.println("Enter Float mark");
			float m2 = sc.nextFloat();
			totalvalue = totalvalue + m2;
			subject--;
			
			
			System.out.println("what is your name ?");
			String name2 = sc.nextLine();
		    System.out.println("my name is :"+Name2);
		 
		    System.out.println("long value is");
		    long longva=sc.nextLong();
		    longvalue = longvalue + longva;
		   
		    System.out.println("boolean values true or false");
		    boolean bn = sc.nextBoolean();
		    if(bn==true) {
		    	System.out.println("is true");
		    	
		    }
		    else if(bn==false) {
		    	System.out.println("is false");
		    }
		    
			
			
			
			}
		System.out.println("Total is :"+ total);
		System.out.println("Total is :"+ totalvalue);
		System.out.println("welcome  Muthukumar to java world");
			}

}
 
