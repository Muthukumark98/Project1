package tamilnadu.chennai;

import java.util.Scanner;
 
public class ProgrammingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingDemo pd = new ProgrammingDemo();
		pd.getInputFromUser();
		}
	private void getInputFromUser() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int sub = 22;
		while(sub>0)
		{
		int m1 = sc.nextInt();
		total = total+m1;
		sub--;
		}
		System.out.println("Total"+" "+total);
	}
}
	
