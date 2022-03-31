package tamilnadu.chennai;

import java.util.Scanner;

public class ChennaiToMaduraiDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many km in Chennei to Madurai ?");
		int Distance = sc.nextInt();
		System.out.println("How many speed set your trip ?");
		int Speed = sc.nextInt();
		System.out.println("how many Hours in travel");
		System.out.println(Distance/Speed);
		
		
	}

}

