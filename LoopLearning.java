package tamilnadu.chennai;

import java.util.Scanner;

public class LoopLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopLearning ll = new LoopLearning();
		//ll.loop_learing();
		//ll.getInputfromUser();
		ll.getInputFromUser2();
		
	}
    private void getInputFromUser2() {
		// TODO Auto-generated method stub
		Scanner sc2 = new Scanner(System.in);
		int total=0;
		int sub = 5;
		while(sub>0)
		{
		System.out.println("Enter the mark");
		int mark = sc2.nextInt();
		total = total+mark;
		sub--;	
		}
		System.out.println("total is "+ total);
		
    	
    	
	}
    
	private void getInputfromUser() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark");
		int i = sc.nextInt();
		System.out.println(i+10);// enter the value
		
	}
	private void loop_learing() {
		// TODO Auto-generated method stub
	   int total =0; 
	   int mark1 = 90;
	   total = total+mark1;
	   int mark2 = 100;
	   total = total+mark2;
	   int mark3 = 190;
	   total = total+mark3;
	   int mark4 = 100;
	   total = total+mark4;
	   int mark5 = 180;
	   total = total+mark5;
	   System.out.println("total is"+total);
	   }
	}

