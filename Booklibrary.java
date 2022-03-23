package tamilnadu.chennai;

import java.util.Scanner;

public class Booklibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booklibrary bl = new Booklibrary();
		bl.shoopingbook();
	}

	private void shoopingbook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		
		int Shopping=sc.nextInt();
		if(Shopping>100)
		{
			if(Shopping==599)
			{
				System.out.println("You can buy MANIRATNAM BOOKS");
			}
			else if(Shopping==400)
			{
				System.out.println("you can buy  GVM books");
			}
			else
			{
				System.out.println("you can buy indian Forming books ");
			}
		}
		else
		{
			System.out.println("you cannot buy the books");
		}
			
	}

}

